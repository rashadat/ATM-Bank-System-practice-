package ATM;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to ATM");


        String[] menu = {"1.Balance", "2.Deposit", "3.Withdraw", "4.Transaction", "5.Exit"};

        Account myAccount = new Account(0);

        int option;
        double amount;

        do {
            System.out.println("******************");
            for (String item : menu)
                System.out.println(item);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    myAccount.showBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    myAccount.deposit(amount);

                    break;
                case 3:
                    System.out.println("Enter withdraw amount: ");
                    amount = scanner.nextDouble();
                    myAccount.withdraw(amount);
                    break;
                case 4:
                    myAccount.showTransactions();

                    break;
                case 5:
                    System.out.println("Bye, Thank you!");
                    break;
                default:
                    System.out.println("Choose correct option");

            }


        } while (option != 5);
    }
}
