package com.hackathon.QBDemo;

import com.hackathon.QBDemo.model.xml.ItemInventoryQueryRqType;
import com.hackathon.QBDemo.model.xml.ItemInventoryQueryRsType;
import com.hackathon.QBDemo.model.xml.QBXML;
import com.hackathon.QBDemo.model.xml.QBXMLMsgsRq;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

//@SpringBootApplication
public class QbDemoApplication {

	public static void main(String[] args) {

		// Preparing XML to be sent
		String requestXML;
		QBXML queryXml = new QBXML();
		QBXMLMsgsRq queryXmlMsgRq = new QBXMLMsgsRq();
		ItemInventoryQueryRqType test = new ItemInventoryQueryRqType();
		test.setRequestID("1234");
		queryXmlMsgRq.getHostQueryRqOrCompanyQueryRqOrCompanyActivityQueryRq().add(test);
		queryXmlMsgRq.setOnError("stopOnError");
		queryXml.setQBXMLMsgsRq(queryXmlMsgRq);

		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
		XMLStreamWriter xmlStreamWriter = null;

        try(StringWriter stringWriter = new StringWriter();) {
            JAXBContext marshallerJaxbContext = JAXBContext.newInstance(QBXML.class);
			Marshaller marshaller = marshallerJaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
			xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
			// add processing instruction to define the qb xml library version
			xmlStreamWriter.writeProcessingInstruction("qbxml", "version=\"14.0\"");

			marshaller.marshal(queryXml, xmlStreamWriter);
			requestXML = stringWriter.toString();
			System.out.println(requestXML);
        } catch (JAXBException | XMLStreamException | IOException e) {
            throw new RuntimeException(e);
        } finally {
			if (xmlStreamWriter != null) {
				try {
					xmlStreamWriter.close();
				} catch (XMLStreamException e) {
					// do nothing
				}
			}
		}

		// Communicate with Quickbook desktop app
		/*
			Notice that Quickbook app must be opened in background when running the program for first time,
			and prompt message will be shown when running this program for granting access
		*/
        Variant qbPermissionMode = new Variant(1);
		Variant QBAccessMode = new Variant(2);
		// TODO: Change to the path storing the quickbook file, e.g. C:\...\Group 5 Company.qbw
		String fileLocation = "";
		String appId = "";
		String applicationName = "Demo QuickBook App";
		Dispatch qbXmlRequestProcessor = new Dispatch("QBXMLRP2.RequestProcessor");
		Dispatch.call(qbXmlRequestProcessor, "OpenConnection2", appId, applicationName, qbPermissionMode);
		Variant ticket = Dispatch.call(qbXmlRequestProcessor, "BeginSession", fileLocation, QBAccessMode);
		Variant apiResponse = Dispatch.call(qbXmlRequestProcessor, "ProcessRequest", ticket, requestXML);
		Dispatch.call(qbXmlRequestProcessor, "EndSession", ticket);
		Dispatch.call(qbXmlRequestProcessor, "CloseConnection");

		// unmarshall response string to java object
        try(StringReader reader = new StringReader(apiResponse.toString());) {
            JAXBContext unmarshallerJaxbContext = JAXBContext.newInstance(QBXML.class);
			Unmarshaller unmarshaller = unmarshallerJaxbContext.createUnmarshaller();
			QBXML response = (QBXML) unmarshaller.unmarshal(reader);

			// just for logging the inventory name to console
			response
					.getQBXMLMsgsRs()
					.getHostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs()
					.stream()
					.filter(rs -> rs instanceof ItemInventoryQueryRsType)
					.map(rs -> (ItemInventoryQueryRsType)rs)
					.flatMap(rs -> rs.getItemInventoryRet().stream())
					.forEach(inventory -> System.out.println(inventory.getFullName() + " " + inventory.getPurchaseDesc() + ", quantity: " + inventory.getQuantityOnHand()));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
	}

}
