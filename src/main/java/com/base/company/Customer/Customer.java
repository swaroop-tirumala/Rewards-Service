package main.java.com.base.company.Customer;


import main.java.com.base.company.Transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

//Created by Swaroop Tirumala on 02/03/2020

public class Customer {

    private String name;

    private List<Transaction> transactions;

    public Customer (String name, List<Transaction> transactions) {
        this.name = name;
        transactions = new ArrayList<Transaction>() ;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
