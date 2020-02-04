package main.java.com.base.company.Transaction;

import java.time.LocalDate;

//Created by Swaroop Tirumala on 02/03/2020

public class Transaction {

    public int amount;
    public LocalDate date;

    public Transaction(int amount, LocalDate date){
        this.amount = amount;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
