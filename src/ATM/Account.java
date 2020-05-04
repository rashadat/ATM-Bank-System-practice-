package ATM;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    public Account(double balance) {
        this.balance = balance;
    }

    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public void showBalance() {
        System.out.println("Current balance: " + balance + " AZN");
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT, LocalDateTime.now());
        transactions.add(transaction);

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Enter less amount");
        } else {
            balance -= amount;
            Transaction transaction = new Transaction(amount, TransactionType.WITHDRAW, LocalDateTime.now());
            transactions.add(transaction);
        }

    }

    public void showTransactions() {
        for (Transaction transaction : transactions)
            System.out.println(transaction);

    }

}
