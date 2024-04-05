package com.natwest.entity;


import jakarta.persistence.Entity;
public enum CurrencyType {
    INR, //INR is the base currency
    EUR,
    USD,
    JPY,
    AUD;
}
