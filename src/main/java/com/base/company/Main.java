package main.java.com.base.company;

import main.java.com.base.company.Customer.Customer;
import main.java.com.base.company.Customer.MockCustomerData;
import main.java.com.base.company.Rewards.RewardsCalculator;

//Created by Swaroop Tirumala on 02/03/2020

public class Main {
    public static void main(String[] args) {

        MockCustomerData mockCustomerData = new MockCustomerData();
        RewardsCalculator rewardsCalculator = new RewardsCalculator();

       for (Customer customer: mockCustomerData.generateCustomers()) {
           try {
            rewardsCalculator.getRewardSummary(customer, customer.getTransactions());
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
       }


    }
}
