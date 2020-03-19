package com.fairpay.payments.bankVault.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String currency;
    private double amount;
    private double minimumAmountForTransfer;

    public Currency() {

    }

    public Currency(String currency) {
        this.currency = currency;
    }

    public Currency(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }
}
