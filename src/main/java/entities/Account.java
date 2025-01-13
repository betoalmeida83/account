package entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double depositValue) {
        this.balance += depositValue;
    }

    public void withdrawValue(double withdrawValue) {
        this.balance -= (withdrawValue + 5.0);
    }



}
