package com.demo.payment.model;

import java.io.Serializable;

public class CardDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String number;
    private String expirationMonth;
    private String expirationYear;
    private String cvv;

    public CardDto() {
    }

    public CardDto(String number, String expirationMonth, String expirationYear, String cvv) {
        this.number = number;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
