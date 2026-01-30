import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Please collect your cash.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class ATMApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // initial balance

        int choice;

        do {
            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                account.deposit(amount);

            } else if (choice == 3) {
                System.out.println("Current Balance: " + account.getBalance());

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");

            } else {
                System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

