package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = input.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);

        Account account;

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        }
        else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("Account data:");
        System.out.print("Account " + account.getAccountNumber());
        System.out.print(", Holder: " + account.getAccountHolder());
        System.out.printf(", Balance: $ %.2f%n", account.getBalance());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = input.nextDouble();
        account.depositValue(depositValue);
        System.out.println("Update account data:");
        System.out.print("Account " + account.getAccountNumber());
        System.out.print(", Holder: " + account.getAccountHolder());
        System.out.printf(", Balance: $ %.2f%n", account.getBalance());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = input.nextDouble();
        account.withdrawValue(withdrawValue);
        System.out.println("Update account data:");
        System.out.print("Account " + account.getAccountNumber());
        System.out.print(", Holder: " + account.getAccountHolder());
        System.out.printf(", Balance: $ %.2f%n", account.getBalance());

        input.close();

    }
}
