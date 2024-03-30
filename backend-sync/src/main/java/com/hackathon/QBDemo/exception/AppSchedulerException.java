package com.hackathon.QBDemo.exception;

import com.hackathon.QBDemo.constant.SchedulerConstant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppSchedulerException extends Exception {
    private SchedulerConstant.SchedulerExceptionCode codeConstant;

    public AppSchedulerException(SchedulerConstant.SchedulerExceptionCode codeConstant){
        super(codeConstant.getCode());
        this.codeConstant = codeConstant;
    }
    public AppSchedulerException(SchedulerConstant.SchedulerExceptionCode codeConstant, String message){
        super(String.format("%s - %s", codeConstant.getCode(), message));
        this.codeConstant = codeConstant;
    }
}
