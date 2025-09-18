package main.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class InputsUtils {
	
	private static Scanner reader = new Scanner(System.in) ;
	
	public static byte readByte() {
		
		byte choice = -1;
		System.out.print("enter your choice : ");
		while(true) {
			
			try {
			choice =  reader.nextByte();
			break;
			}
			catch (InputMismatchException e) {
				reader.next();
				System.out.printf("wrong choice! enter your a valid choice : ");
			}
			}
		return choice;
	}
	
	public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message);
                return reader.nextFloat();
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a decimal number.");
            }
        }
    }

}
