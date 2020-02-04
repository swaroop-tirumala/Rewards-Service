package main.java.com.base.company.Rewards;

import main.java.com.base.company.Customer.Customer;
import main.java.com.base.company.Transaction.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Created by Swaroop Tirumala on 02/03/2020

public class RewardsCalculator {

    //Returns entire summary
    public void getRewardSummary(Customer customer, List<Transaction> transactionList) {
        System.out.println("\n"+"Getting rewards for the customer :" + customer.getName());
        getTotalRewards(transactionList);
        getMonthlyRewards(transactionList,1);
        getMonthlyRewards(transactionList,2);
        getMonthlyRewards(transactionList,3);
    }

    //Logic to calculate rewards points based on logic
    private int calculateRewards(int amount) {

        if (amount >= 50 && amount <= 100) {
            return amount - 50;
        } else if (amount > 100) {
            return (2 * (amount - 100) + 50);
        }
        return 0;
    }

    //Returns monthly rewards of an individual
    private void getMonthlyRewards(List<Transaction> transactionList, int month) {
        final ArrayList<Integer> currentMonthRewards = new ArrayList();
        getMonthlyTransactions(transactionList, month).stream().forEach(transaction ->
                {
                   currentMonthRewards.add(calculateRewards(transaction.amount));

                }
        );
        System.out.println("Reward Points you earned for the Month - "+ LocalDate.now().minusMonths(month).getMonth()+" are :" + currentMonthRewards.stream().reduce(0, (a, b) -> a + b) + " points");
    }

    //Retrieves monthly transactions of an individual
    private List<Transaction> getMonthlyTransactions(List<Transaction> transactionList, int month) {
        LocalDate startDate = LocalDate.now();
        LocalDate oldDate = startDate.minusMonths(month);
        List<Transaction> filteredList = transactionList
                .stream().filter(transaction -> (transaction.date.isAfter(oldDate) && transaction.date.isBefore(oldDate.plusMonths(1)))).collect(Collectors.toList());
        return filteredList;
    }

    //Returns total rewards for an individual
    private void getTotalRewards(List<Transaction> transactionList) {
        final ArrayList<Integer> Rewards = new ArrayList();
       transactionList.stream().forEach(transaction ->
                {
                    Rewards.add(calculateRewards(transaction.amount));

                }
        );
        System.out.println("Total Reward Points you earned are :" + Rewards.stream().reduce(0, (a, b) -> a + b) + " points");
    }

}