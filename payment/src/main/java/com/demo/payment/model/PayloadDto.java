package com.demo.payment.model;

import java.io.Serializable;

public class PayloadDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String amount;
    private String currency;
    private String type;
    private CardDto card;

    public PayloadDto() {
    }

    public PayloadDto(String amount, String currency, String type, CardDto card) {
        this.amount = amount;
        this.currency = currency;
        this.type = type;
        this.card = card;
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

    public CardDto getCard() {
        return card;
    }

    public void setCard(CardDto card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "PayloadDto{" +
                "amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", card=" + card +
                '}';
    }
}
