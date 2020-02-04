package main.java.com.base.company.Customer;

import main.java.com.base.company.Transaction.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Created by Swaroop Tirumala on 02/03/2020

public class MockCustomerData {

    //Generates Mock Data
    public List<Customer> generateCustomers() {
        List<Customer> customerList = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        Customer customer = new Customer("Bob",transactions);
        transactions.add(0,new Transaction(150, LocalDate.of(2019, 11,10)));
        transactions.add(1,new Transaction(50, LocalDate.of(2019, 11,15)));
        transactions.add(2,new Transaction(10, LocalDate.of(2019, 12,20)));
        transactions.add(3,new Transaction(170, LocalDate.of(2019, 12,10)));
        transactions.add(4,new Transaction(180, LocalDate.of(2020, 1,20)));
        List<Transaction> transactions1 = new ArrayList<>();
        Customer customer1 = new Customer("Cat",transactions1);
        transactions1.add(0,new Transaction(100, LocalDate.of(2019, 11,10)));
        transactions1.add(1,new Transaction(60, LocalDate.of(2019, 11,15)));
        transactions1.add(2,new Transaction(20, LocalDate.of(2019, 12,20)));
        transactions1.add(3,new Transaction(180, LocalDate.of(2019, 12,10)));
        transactions1.add(4,new Transaction(140, LocalDate.of(2020, 1,20)));
        List<Transaction> transactions2 = new ArrayList<>();
        Customer customer2 = new Customer("Tom",transactions2);
        transactions2.add(0,new Transaction(120, LocalDate.of(2019, 11,10)));
        transactions2.add(1,new Transaction(70, LocalDate.of(2019, 11,15)));
        transactions2.add(2,new Transaction(30, LocalDate.of(2019, 12,20)));
        transactions2.add(3,new Transaction(90, LocalDate.of(2019, 12,10)));
        transactions2.add(4,new Transaction(110, LocalDate.of(2020, 1,20)));
        customer.setTransactions(transactions);
        customer1.setTransactions(transactions1);
        customer2.setTransactions(transactions2);
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        return customerList;
    }
}
