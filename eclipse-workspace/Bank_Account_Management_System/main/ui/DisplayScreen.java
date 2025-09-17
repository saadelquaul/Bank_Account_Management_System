package main.ui;

import java.util.InputMismatchException;

import main.utils.InputsUtils;

public abstract class DisplayScreen {

	public static void mainMenu() {

		System.out.print("\t\t Main Menu \n");
		System.out.println("to create an account press : 1");
		System.out.println("to login press : 2");
		System.out.println("to exit press : 0");
		System.out.print("enter your choice : ");

		switch(InputsUtils.readByte()) {
		
		case 1 : {
			createNewAccountScreen();
		};
		case 2 : {
			
		};
		case 0 : {
			
		};
		}

	}

	public static void createNewAccountScreen() {

		System.out.print("Which kind of accounts you want to open?:\n");
		System.out.print("Savings Account press : 1\n");
		System.out.print("Current Account press : 2\n");
		
		if(InputsUtils.readByte() == 1 ) {
			
			createSavingsAccountScreen();
			
		}else {
			createCurrentAccountScreen();
		}

	}

	public static void createSavingsAccountScreen() {

	}

	public static void createCurrentAccountScreen() {

	}
}
