import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int balance;

    BankAccount(String name, int balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        int balance = sc.nextInt();

        BankAccount acc = new BankAccount(name, balance);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextInt());
                    break;
                case 3:
                    acc.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}