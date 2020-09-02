package com.demo.payment.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Component
public class PaymentResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String amount;
    private String currency;
    private String type;
    private ResponseCardDto card;
    private String status;
    private String authorization_code;
    private String time;

    public PaymentResponseDto() {
    }

    public PaymentResponseDto(String amount, String currency, String type, ResponseCardDto card, String status, String authorization_code, String time) {
        this.amount = amount;
        this.currency = currency;
        this.type = type;
        this.card = card;
        this.status = status;
        this.authorization_code = authorization_code;
        this.time = time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResponseCardDto getCard() {
        return card;
    }

    public void setCard(ResponseCardDto card) {
        this.card = card;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorization_code() {
        return authorization_code;
    }

    public void setAuthorization_code(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
