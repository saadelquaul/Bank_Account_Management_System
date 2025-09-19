package main.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.model.Account;
import main.model.CurrentAccount;
import main.model.Operation;
import main.service.AccountService;
import main.utils.InputsUtils;

public abstract class DisplayScreen {
	static Scanner reader = new Scanner(System.in);
	static AccountService service = new AccountService();

	public static void mainMenu() {

		boolean running = true;
		while (running) {
			showMenu();
			byte choice = readChoice();

			switch (choice) {
			case 1:
				createAccountMenu();

				break;
			case 2:
				loginMenu();

				break;
			case 3:
				transferMenu();
				break;
			case 4:
				searchAccountMenu();
				break;
			case 0:
				System.out.println("Exiting program... Exited Successfully!");
				running = false;
				break;
			}
		}

	}

	public static void showMenu() {
		System.out.println("\n=========== MAIN MENU ===========");
		System.out.println(" 1. Create an Account");
		System.out.println(" 2. Login");
		System.out.println(" 0. Exit");
		System.out.println("=================================");
		System.out.print("Enter your choice: ");
	}

	public static byte readChoice() {
		while (true) {
			try {
				byte choice = reader.nextByte();
				
					return choice;
				
			} catch (InputMismatchException e) {
				reader.nextLine();
				System.out.print("Wrong input! Please enter a number : ");
			}
		}
	}

	public static void createAccountMenu() {
		System.out.println("\n--- CREATE ACCOUNT ---");
		System.out.println(" 1. Current Account");
		System.out.println(" 2. Savings Account");
		System.out.print("Choose account type: ");

		byte type = readChoice();
		try {
			System.out.print("Enter initial deposit: ");
			float deposit = reader.nextFloat();

			switch (type) {
			case 1: {
				System.out.print("Enter overdraft limit: ");
				float overdraft = reader.nextFloat();
				Account acc = service.createCurrentAccount(deposit, overdraft);
				System.out.println("Current account created! Code: " + acc.getCode());break;
			}
			case 2: {
				System.out.print("Enter interest rate (%): ");
				float rate = reader.nextFloat();
				Account acc = service.createCompteEpargne(deposit, rate);
				System.out.println("Savings account created! Code: " + acc.getCode());break;
			}
			default:
				System.out.println("Invalid account type.");
			}
		} catch (InputMismatchException e) {
			reader.nextLine();
			System.out.println("Invalid input. Try again.");
		}
	}

	public static void loginMenu() {
		System.out.println("\n--- LOGIN ---");
		System.out.print("Enter account code: ");
		String code = reader.next();
		Account acc = service.getAccount(code);
		if (acc != null) {
			System.out.println("Logged in successfully! Balance: " + acc.getBalance());
			accountOperationsMenu(acc);
		} else {
			System.out.println("Account not found.");
		}
	}
	
	public static void transferMenu() {
        System.out.println("\n--- TRANSFER ---");
        System.out.print("Enter FROM account code: ");
        String from = reader.next();
        System.out.print("Enter TO account code: ");
        String to = reader.next();
        System.out.print("Enter amount: ");
        float amount = reader.nextFloat();

        service.transfer(from, to, amount);
    }
	
	public static void searchAccountMenu() {
        System.out.println("\n--- SEARCH ACCOUNT ---");
        System.out.print("Enter account code: ");
        String code = reader.next();
        Account acc = service.getAccount(code);
        if (acc != null) {
            System.out.println("Account found! Code: " + acc.getCode() + " | Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
	
	public static void transferUI(Account acc) {
	    System.out.println("\n--- TRANSFER ---");

	    String fromCode = acc.getCode();

	    System.out.print("Enter destination account code: ");
	    String toCode = reader.next();

	    System.out.print("Enter amount to transfer: ");
	    float amount = reader.nextFloat();

	    try {
	        service.transfer(fromCode, toCode, amount);
	    } catch (Exception e) {
	        System.out.println("Transfer failed: " + e.getMessage());
	    }
	}
	
	public static void accountOperationsMenu(Account acc) {
	    boolean loggedIn = true;

	    while (loggedIn) {
	        System.out.println("\n--- ACCOUNT MENU (" + acc.getCode() + ") ---");
	        System.out.println(" 1. Deposit");
	        System.out.println(" 2. Withdraw");
	        System.out.println(" 3. Check Balance");
	        System.out.println(" 4. View Transactions");
	        System.out.println(" 5. Transfer between accounts");
	        System.out.println(" 0. Logout");
	        System.out.print("Enter your choice: ");

	        byte choice = readChoice();

	        switch (choice) {
	            case 1 : {
	                System.out.print("Enter deposit amount: ");
	                float amount = reader.nextFloat();
	                acc.Deposit(amount);
	                System.out.println(" Deposited " + amount + ". New balance: " + acc.getBalance());break;
	            }
	            case 2 : {
	                System.out.print("Enter withdrawal amount: ");
	                float amount = reader.nextFloat();
	                try {
	                    acc.withdraw(amount);
	                    System.out.println("Withdrawn " + amount + ". New balance: " + acc.getBalance());
	                } catch (IllegalArgumentException e) {
	                    System.out.println(e.getMessage());
	                }
	                
	                break;
	            }
	            case 3 : {
	                System.out.println("Balance: " + acc.getBalance());
	                break;
	            }
	            case 4 : {
	                System.out.println("--- TRANSACTIONS ---");
	                for (Operation t : acc.getOperations()) {
	                    System.out.println(t.showDetails());
	                }
	                break;
	            }
	            case 5 : {
	            	
	            	transferUI();
	            	break;
	            }
	            case 0 : {
	                System.out.println("Logged out.");
	                loggedIn = false;break;
	            }
	            default : System.out.println("Invalid choice.");
	        }
	    
}
	}
	

}
