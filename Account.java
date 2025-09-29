import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String accountHolder;
    protected double balance;
    protected List<String> transactions;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            transactions.add("Failed withdrawal: " + amount + " (Insufficient balance)");
            System.out.println("Insufficient balance!");
        }
    }

    public void printTransactions() {
        System.out.println("\n--- Transaction History for " + accountHolder + " ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}
