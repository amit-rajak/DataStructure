package com.oops.barcley;
import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    private long accountId;
    private double balance;
    private String accountType;
    private Customer customer;

    public Account() {
        super();
    }

    public Account(long accountId, double balance, String accountType, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountType = accountType;
        this.customer = customer;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, balance, accountType, customer);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountId == account.accountId &&
                Double.compare(account.balance, balance) == 0 &&
                Objects.equals(accountType, account.accountType) &&
                Objects.equals(customer, account.customer);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", customer=" + customer +
                '}';
    }
}
