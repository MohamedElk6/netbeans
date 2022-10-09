package main;

public class BankAccount {
    public long accountNumber; 
    private double amount;
    public BankAccount(long accountNumber){
        this.accountNumber = accountNumber;
        amount = 0;
    }
    public void deposit(double amount){
        this.amount+=amount;
    }
    public void withdraw(double amount){
        this.amount-=amount;
    }
    public double getBalance(){
        return this.amount;
    }
    public void transfer(double amount, BankAccount targetAccount){
        this.accountNumber -= amount;
        targetAccount.accountNumber += amount;
    }
}