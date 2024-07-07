package BankAccountHw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<SavingsAccount> ac1 = new ArrayList<>();
    static ArrayList<CheckingAccount> ac2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create a new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Deduct Transaction Fee");
            System.out.println("8. Exit");
            System.out.print("Enter option: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    create(sc);
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    getBalance(sc);
                    break;
                case 5:
                    display(sc);
                    break;
                case 6:
                    calculateInterest(sc);
                    break;
                case 7:
                    deductTransactionFee(sc);
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void create(Scanner sc) {
        System.out.println("Enter account type (1. Savings, 2. Checking): ");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        if (type == 1) {
            System.out.print("Enter interest rate: ");
            double interestRate = sc.nextDouble();
            SavingsAccount sa = new SavingsAccount(accNo, balance, interestRate);
            ac1.add(sa);
            System.out.println("Savings account created successfully.");
        } else if (type == 2) {
            System.out.print("Enter transaction limit: ");
            double transactionLimit = sc.nextDouble();
            CheckingAccount ca = new CheckingAccount(accNo, balance, transactionLimit);
            ac2.add(ca);
            System.out.println("Checking account created successfully.");
        } else {
            System.out.println("Invalid account type.");
        }
    }

    static void deposit(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        for (SavingsAccount sa : ac1) {
            if (sa.getAccountNumber().equals(accNo)) {
                sa.deposit(amount);
                return;
            }
        }
        for (CheckingAccount ca : ac2) {
            if (ca.getAccountNumber().equals(accNo)) {
                ca.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    static void withdraw(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        for (SavingsAccount sa : ac1) {
            if (sa.getAccountNumber().equals(accNo)) {
                sa.withdraw(amount);
                return;
            }
        }
        for (CheckingAccount ca : ac2) {
            if (ca.getAccountNumber().equals(accNo)) {
                ca.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found or insufficient funds.");
    }

    static void getBalance(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        for (SavingsAccount sa : ac1) {
            if (sa.getAccountNumber().equals(accNo)) {
                System.out.println("Balance: " + sa.getBalance() + " Taka");
                return;
            }
        }
        for (CheckingAccount ca : ac2) {
            if (ca.getAccountNumber().equals(accNo)) {
                System.out.println("Balance: " + ca.getBalance() + " Taka");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    static void display(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        for (SavingsAccount sa : ac1) {
            if (sa.getAccountNumber().equals(accNo)) {
                System.out.println(sa);
                return;
            }
        }
        for (CheckingAccount ca : ac2) {
            if (ca.getAccountNumber().equals(accNo)) {
                System.out.println(ca);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    static void calculateInterest(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        for (SavingsAccount sa : ac1) {
            if (sa.getAccountNumber().equals(accNo)) {
                sa.calculateInterest(years);
                return;
            }
        }
        System.out.println("Savings account not found or invalid account type.");
    }

    static void deductTransactionFee(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter transaction amount: ");
        double amount = sc.nextDouble();
        for (CheckingAccount ca : ac2) {
            if (ca.getAccountNumber().equals(accNo)) {
                ca.deductTransectionFee(amount);
                return;
            }
        }
        System.out.println("Checking account not found or invalid account type.");
    }
}
