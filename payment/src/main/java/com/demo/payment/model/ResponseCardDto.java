package com.demo.payment.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class ResponseCardDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String number;

    public ResponseCardDto() {
    }

    public ResponseCardDto(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
