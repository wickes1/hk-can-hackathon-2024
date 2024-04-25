package com.hackathon.QBDemo.factory.qbQuery;

import com.hackathon.QBDemo.model.qbXml.QBXML;
import com.hackathon.QBDemo.model.qbXml.QBXMLMsgsRq;

public abstract class QBQueryFactory {
    protected QBXML createBaseQBXmlMsgRq(){
        QBXML qbxml = new QBXML();
        QBXMLMsgsRq queryXmlMsgRq = new QBXMLMsgsRq();
        queryXmlMsgRq.setOnError("stopOnError");
        qbxml.setQBXMLMsgsRq(queryXmlMsgRq);
        return qbxml;
    }

    protected void addQuery(QBXML qbxml, Object o){
        qbxml.getQBXMLMsgsRq().getHostQueryRqOrCompanyQueryRqOrCompanyActivityQueryRq().add(o);
    }
}
