/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */

/* Exercise #10 & 11 - SavingsAccount Class
     * 
     * Design a SavingsAccount class that stores a savings account's annual 
     * interest rate and balance. The class constructor should accept the amount 
     * of the savings account's starting balance. The class should also have 
     * methods for subtracting the amount of a withdrawal, adding the amount of 
     * a deposit, and adding the amount of monthly interest to the balance. The 
     * monthly interest rate the annual interest rate divided by twelve. To add 
     * the monthly interest to the balance, multiply the monthly interest rate 
     * by the balance, and add the result to the balance.
     *
     * NOTE: Not all required methods are described here. 
     * 
     * The following methods (and associated unit tests) will tell you if you
     * are on the right track.
     * - Gaddis pg- 403-4
     */

package cpd3314.assign6;

/**
 * @author Yatin Patel
 */
public class SavingsAccount {
    // TODO: Build the SavingsAccount Class 
    double interest;
    double balance;
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public SavingsAccount(double annualinterest, double startingbalance)
    { 
     interest =  annualinterest;
     balance = startingbalance;
    }
   public double withdraw(double withdrawal)
   {
    balance = balance - withdrawal;
    return balance;
   }
   public double deposit(double amountin)
   {
    balance = balance + amountin;
    return balance;
   }
    public double calculateInterest()
  {
    double monRate;

    monRate= interest / 12;
    interest = balance * monRate;
    
    balance = balance + interest;
    return balance;
  }
  
  public double getTotalDeposits()
  {
    return balance;
  }
  public double getTotalWithdrawals()
  {
    return balance;
  }
 public double getTotalInterest()
  {
    return balance;
  }
}

