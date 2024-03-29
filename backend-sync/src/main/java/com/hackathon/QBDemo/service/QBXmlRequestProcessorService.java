package com.hackathon.QBDemo.service;


import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class QBXmlRequestProcessorService {
    private final Variant qbPermissionMode = new Variant(1);
    private final Variant qbAccessMode = new Variant(2);

    @Value("${app.quickbook.filePath}")
    private String qbFilePath;

    @Value("${app.quickbook.applicationName}")
    private String applicationName;

    private final Dispatch qbXmlRequestProcessor;

    public QBXmlRequestProcessorService(){
        qbXmlRequestProcessor = new Dispatch("QBXMLRP2.RequestProcessor");
    }

    @PostConstruct
    private void init() {
        Dispatch.call(qbXmlRequestProcessor, "OpenConnection2", "", applicationName, qbPermissionMode);
    }

    public Variant beginSession(){
        return Dispatch.call(qbXmlRequestProcessor, "BeginSession", qbFilePath, qbAccessMode);
    }

    public Variant sendRequest(Variant session, String requestXML){
        return Dispatch.call(qbXmlRequestProcessor, "ProcessRequest", session, requestXML);
    }

    public void closeSession(Variant session){
        Dispatch.call(qbXmlRequestProcessor, "EndSession", session);
    }

    @PreDestroy
    private void close(){
        Dispatch.call(qbXmlRequestProcessor, "CloseConnection");
    }

}
