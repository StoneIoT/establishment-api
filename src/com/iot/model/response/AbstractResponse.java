package com.iot.model.response;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public abstract class AbstractResponse {

    protected boolean success;

    private String message;

    public boolean isSuccess() {
        return success;
    }

    public abstract void setSuccess();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
