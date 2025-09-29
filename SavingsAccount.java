public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Cannot withdraw! Minimum balance of 500 required.");
            transactions.add("Failed withdrawal: " + amount + " (Below minimum balance)");
        } else {
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        transactions.add("Interest applied: " + interest);
    }
}
