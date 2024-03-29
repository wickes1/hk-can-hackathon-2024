package com.hackathon.QBDemo.util;

import com.hackathon.QBDemo.factory.JaxbContextFactory;
import com.hackathon.QBDemo.model.qbXml.QBXML;
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

public class QBXmlMarshaller {

    public static String marshall(QBXML xml){
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter xmlStreamWriter = null;

        try(StringWriter stringWriter = new StringWriter();) {
            JAXBContext marshallerJaxbContext = JaxbContextFactory.getJAXBContext(QBXML.class);
            Marshaller marshaller = marshallerJaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
            xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
            // add processing instruction to define the qb xml library version
            xmlStreamWriter.writeProcessingInstruction("qbxml", "version=\"14.0\"");

            marshaller.marshal(xml, xmlStreamWriter);
            return stringWriter.toString();
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
    }

    public static QBXML unmarshall(Variant apiResponse){
        try(StringReader reader = new StringReader(apiResponse.toString());) {
            JAXBContext unmarshallerJaxbContext = JaxbContextFactory.getJAXBContext(QBXML.class);
            Unmarshaller unmarshaller = unmarshallerJaxbContext.createUnmarshaller();
            return (QBXML) unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
