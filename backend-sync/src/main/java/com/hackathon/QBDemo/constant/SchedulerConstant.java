package com.hackathon.QBDemo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class SchedulerConstant {

    @Getter
    @AllArgsConstructor
    public enum SchedulerExceptionCode {
        QB_QUERY_RESPONSE_MALFORMAT("QB_QUERY_RESPONSE_MALFORMAT"),
        QB_QUERY_RESPONSE_ERROR("QB_QUERY_RESPONSE_ERROR"),
        LOCK_SCHEDULER_FAILED("LOCK_SCHEDULER_FAILED"),
        UNLOCK_SCHEDULER_FAILED("UNLOCK_SCHEDULER_FAILED"),
        SCHEDULER_PARAMS_NOT_FOUND("SCHEDULER_PARAMS_NOT_FOUND"),
        SCHEDULER_INACTIVE("SCHEDULER_INACTIVE");

        private final String code;
    }

    @Getter
    @AllArgsConstructor
    public enum SchedulerKey {
        QBInventorySync("QBInventorySync");
        private final String key;
    }
}
