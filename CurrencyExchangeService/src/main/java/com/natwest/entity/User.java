package com.natwest.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class User {

    @Id
    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;

    private BigDecimal balance;

    public User() {
    }


    public User(String emailAddress, CurrencyType currencyType, BigDecimal balance) {
        this.emailAddress = emailAddress;
        this.currencyType = currencyType;
        this.balance = balance;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }




}

