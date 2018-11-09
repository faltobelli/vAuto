package com.cox.vAuto.models;

public class ResponseModel {

    private Boolean success;
    private String message;
    private Integer totalMilliseconds;


    public Integer getTotalMilliseconds() {
        return totalMilliseconds;
    }

    public void setTotalMilliseconds(Integer totalMilliseconds) {
        this.totalMilliseconds = totalMilliseconds;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
