package com.natwest.exceptionhandler;

import org.springframework.http.HttpStatus;

public class ErrorInfo {
    private String errMsg;
    private HttpStatus staus;

    public ErrorInfo() {
    }

    public ErrorInfo(String errMsg, HttpStatus staus) {
        this.errMsg = errMsg;
        this.staus = staus;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public HttpStatus getStaus() {
        return staus;
    }

    public void setStaus(HttpStatus staus) {
        this.staus = staus;
    }


    @Override
    public String toString() {
        return "ErrorInfo{" +
                "errMsg='" + errMsg + '\'' +
                ", staus=" + staus +
                '}';
    }
}

