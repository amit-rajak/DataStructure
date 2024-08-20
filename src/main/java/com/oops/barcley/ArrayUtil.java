package com.oops.barcley;
import java.time.LocalDate;
public class ArrayUtil {
    public static Account[] accounts = new Account[10];
    public static Transaction[] transactions = new Transaction[10];
    public static Customer[] customers = new Customer[10];

    static {
        customers[0] = new Customer(100198, "Sagar", "Chakwate", "sagardc");
        customers[1] = new Customer(100197, "Ashok", "Patil", "ashokp");
        customers[2] = new Customer(100196, "Rohan", "Pawar", "rpawar");
        customers[3] = new Customer(100195, "Naarad", "Swamy", "nswamy");
        customers[4] = new Customer(100194, "Shweta", "Patil", "shwetap");

        accounts[0] = new Account(100000000561L, 6700.00, "Savings", customers[0]);
        accounts[1] = new Account(100000000552L, 4500.00, "Current", customers[1]);
        accounts[2] = new Account(100000000543L, 230.00, "Current", customers[2]);
        accounts[3] = new Account(100000000534L, 780.00, "Savings", customers[3]);
        accounts[4] = new Account(100000000525L, 400.00, "Savings", customers[4]);

        transactions[0] = new Transaction(1, "Flipkart", LocalDate.of(2024, 8, 1), 568.00, accounts[0]);
        transactions[1] = new Transaction(2, "Paytm", LocalDate.of(2024, 8, 2), 456.78, accounts[2]);
        transactions[2] = new Transaction(3, "Phonepe", LocalDate.of(2024, 8, 3), 110.00, accounts[3]);
    }

    // Create Methods
    public static Customer addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                return customer;
            }
        }
        return null;
    }

    public static Account addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return account;
            }
        }
        return null;
    }

    public static Transaction addTransaction(Transaction transaction) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                return transaction;
            }
        }
        return null;
    }

    // Update Methods
    public static Customer updateCustomer(int custId, Customer updatedCustomer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustId() == custId) {
                customers[i] = updatedCustomer;
                return updatedCustomer;
            }
        }
        return null;
    }

    public static Account updateAccount(long accountId, Account updatedAccount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountId() == accountId) {
                accounts[i] = updatedAccount;
                return updatedAccount;
            }
        }
        return null;
    }

    public static Transaction updateTransaction(int transactionId, Transaction updatedTransaction) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != null && transactions[i].getTransactionId() == transactionId) {
                transactions[i] = updatedTransaction;
                return updatedTransaction;
            }
        }
        return null;
    }

    // Delete Methods
    public static boolean deleteCustomer(int custId) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustId() == custId) {
                customers[i] = null;
                return true;
            }
        }
        return false;
    }

    public static boolean deleteAccount(long accountId) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountId() == accountId) {
                accounts[i] = null;
                return true;
            }
        }
        return false;
    }

    public static boolean deleteTransaction(int transactionId) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] != null && transactions[i].getTransactionId() == transactionId) {
                transactions[i] = null;
                return true;
            }
        }
        return false;
    }

    // Search Methods
    public static Customer searchCustomer(int custId) {
        for (Customer c : customers) {
            if (c != null && c.getCustId() == custId) {
                return c;
            }
        }
        return null;
    }

    public static Account searchAccount(long accountId) {
        for (Account a : accounts) {
            if (a != null && a.getAccountId() == accountId) {
                return a;
            }
        }
        return null;
    }

    public static Transaction searchTransaction(int transactionId) {
        for (Transaction t : transactions) {
            if (t != null && t.getTransactionId() == transactionId) {
                return t;
            }
        }
        return null;
    }
}
