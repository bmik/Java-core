package com.ahmed.learn.simple.customer;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by ahmed on 16.08.2015.
 */
public class Customer {

    private String name;
    private int accountNumber;
    private Locale locale;
    private BigDecimal balance;

    public Customer() {
        this.name = "Default Customer";
        this.accountNumber = 12345;
        this.locale = new Locale("pl", "PL");
        this.balance = new BigDecimal("0");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Names must not be null");
        } else {
            this.name = name;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = new BigDecimal(balance);
    }

    @Override
    public String toString() {

        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        StringBuilder value = new StringBuilder();
        value.append(String.format("Name: %s%n", this.name));
        value.append(String.format("Account number: %d%n", this.accountNumber));
        value.append(String.format("Balance: %s%n", format.format(this.balance)));

        return value.toString();

    }

}
