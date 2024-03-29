package com.hackathon.QBDemo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class QBQueryConstant {

    public static final DateFormat qbQueryDateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public enum RecordActiveStatus {
        ActiveOnly,
        InactiveOnly,
        All
    }

    public enum Iterator {
        Start,
        Continue,
        Stop
    }

    @AllArgsConstructor
    @Getter
    public enum ResponseStatus {
        SUCCESS(BigInteger.ZERO),
        NO_MATCH(BigInteger.ONE);
        private final BigInteger code;
    }
}
