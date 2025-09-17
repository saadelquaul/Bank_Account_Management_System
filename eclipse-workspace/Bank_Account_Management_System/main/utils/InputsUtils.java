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

}
