import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount("John Doe", 1000, 5);

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Apply Interest");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double depositAmt = sc.nextDouble();
                    acc.deposit(depositAmt);
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    double withdrawAmt = sc.nextDouble();
                    acc.withdraw(withdrawAmt);
                }
                case 3 -> System.out.println("Current Balance: " + acc.getBalance());
                case 4 -> acc.applyInterest();
                case 5 -> acc.printTransactions();
                case 6 -> {
                    System.out.println("Thank you for banking!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
