package com.oops.barcley;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Transaction implements Serializable {
    private int transactionId;
    private String description;
    private LocalDate transactionDate;
    private double amount;
    private Account account;

    public Transaction() {
        super();
    }

    public Transaction(int transactionId, String description, LocalDate transactionDate, double amount, Account account) {
        this.transactionId = transactionId;
        this.description = description;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.account = account;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, description, transactionDate, amount, account);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transaction transaction = (Transaction) obj;
        return transactionId == transaction.transactionId &&
                Double.compare(transaction.amount, amount) == 0 &&
                Objects.equals(description, transaction.description) &&
                Objects.equals(transactionDate, transaction.transactionDate) &&
                Objects.equals(account, transaction.account);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", description='" + description + '\'' +
                ", transactionDate=" + transactionDate +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
