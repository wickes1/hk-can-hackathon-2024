package com.hackathon.QBDemo.factory.qbQuery;

import com.hackathon.QBDemo.model.qbXml.QBXML;

import java.util.Date;

public abstract class QBDataRetrievalQueryFactory extends QBQueryFactory {
    public abstract QBXML getAll(String qbRequestId, Date toDate);
    public abstract QBXML getNextIteration(String qbRequestId, String iteratorId);
}
