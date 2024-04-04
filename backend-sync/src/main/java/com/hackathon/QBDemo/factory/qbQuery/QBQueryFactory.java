package com.hackathon.QBDemo.factory.qbQuery;

import com.hackathon.QBDemo.model.qbXml.QBXML;
import com.hackathon.QBDemo.model.qbXml.QBXMLMsgsRq;

public abstract class QBQueryFactory {
    private QBXML qbxml;
    protected void createBaseQBXmlMsgRq(){
        qbxml = new QBXML();
        QBXMLMsgsRq queryXmlMsgRq = new QBXMLMsgsRq();
        queryXmlMsgRq.setOnError("stopOnError");
        qbxml.setQBXMLMsgsRq(queryXmlMsgRq);
    }

    protected void addQuery(Object o){
        qbxml.getQBXMLMsgsRq().getHostQueryRqOrCompanyQueryRqOrCompanyActivityQueryRq().add(o);
    }

    protected QBXML getQbxml(){
        return qbxml;
    }
}
