package com.iot.model.response;

/**
 * Created by JGabrielFreitas on 22/03/17.
 */
public class ErrorResponse extends AbstractResponse {

    @Override
    public void setSuccess() {
        success = false;
    }
}
