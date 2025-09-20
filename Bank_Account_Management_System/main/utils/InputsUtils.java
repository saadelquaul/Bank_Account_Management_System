package main.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class InputsUtils {
	
	private static Scanner reader = new Scanner(System.in) ;
	
	public static byte readByte() {
		
		byte choice ;
		System.out.print("enter your choice : ");
		while(true) {
			
			try {
			choice =  reader.nextByte();
			return choice;
			}
			catch (InputMismatchException e) {
				reader.nextLine();
				System.out.printf("wrong choice! enter your a valid choice : ");
			}
			}
		
	}
	
	public static float readFloat(String message) {
		float floatValue;
		System.out.print(message);
        while (true) {
            try {
              floatValue =  reader.nextFloat();
              return floatValue;
              
            } catch (NumberFormatException | InputMismatchException e) {
            	reader.nextLine();
                System.out.println("❌ Invalid input. Please enter a decimal number.");
                
            }
        }
    }
	
	public static String readString(String message) {
        String input;
        do {
            System.out.print(message);
            input = reader.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

}
