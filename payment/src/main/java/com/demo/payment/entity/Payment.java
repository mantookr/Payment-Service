/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.payment.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mantoo1.Kumar
 */
@Entity
@Table(name = "payment")
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "amount")
    private String amount;
    @Column(name = "type")
    private String type;
    @Column(name = "currency")
    private String currency;
    @Column(name = "card")
    private String card;
    @Column(name = "status")
    private String status;
    @Column(name = "authorization_code")
    private String authorizationCode;

    public Payment() {
    }

    public Payment(Integer id) {
        this.id = id;
    }

    public Payment(Integer id, String amount, String type, String currency, String card, String status, String authorizationCode) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.currency = currency;
        this.card = card;
        this.status = status;
        this.authorizationCode = authorizationCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    @Override
    public String toString() {
        return "com.demo.payment.entity.Payment[ id=" + id + " ]";
    }
    
}
