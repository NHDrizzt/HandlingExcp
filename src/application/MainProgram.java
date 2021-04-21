package application;

import java.util.Scanner;

import models.entities.Account;
import models.exceptions.MainException;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withLimit = sc.nextDouble();

			Account ac = new Account(num, name, balance, withLimit);

			System.out.print("Enter amount for withdraw: ");
			double amountWith = sc.nextDouble();
			ac.withdraw(amountWith);
			System.out.println("New balance: " + ac.getBalance());

		} catch (MainException e) {
			System.out.println("Withdraw Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
