package com.boot.druid.util;

public class Result {

    private String result;

    private String message;

    private Object data;

    public Result() {
    }

    public Result(String result, String message) {
        this.result = result;
        this.message = message;
//        if (!"success".equals(result)) TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }

    public Result(String result, String message, Object data) {
        this.result = result;
        this.message = message;
        this.data = data;
//        if (!"success".equals(result)) TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
