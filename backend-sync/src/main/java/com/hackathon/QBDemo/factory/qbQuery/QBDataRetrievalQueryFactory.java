package com.hackathon.QBDemo.factory.qbQuery;

import com.hackathon.QBDemo.model.qbXml.QBXML;

import java.util.Date;

public abstract class QBDataRetrievalQueryFactory<T> extends QBQueryFactory<T> {
    public abstract QBXML getAll(String qbRequestId, Date fromDate, Date toDate);
    public abstract QBXML getNextIteration(String qbRequestId, String iteratorId);
}
