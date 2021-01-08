package com.greenfox.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    DecimalFormat df = new DecimalFormat("0.00");

    public String name;
    public Double balance;
    public String animalType;
    public String currency;
    public String debt;
    public boolean isKing;

    public BankAccount(String name, String debt ,Double balance, String currency, String animalType, boolean isKing) {
        this.name = name;
        this.debt = debt;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.isKing = isKing;
    }

    public String getDebt(){
        if(this.balance < 0.00){
            this.debt = "-";
        } else {
            this.debt = "+";
        }
        return this.debt;
    }

    public String getKing(){
        if (this.isKing == true) {
            return "style";
        } else {
            return "";
        }
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }




}


