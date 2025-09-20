package main.utils;

import java.util.List;
import java.util.Random;

import main.model.Account;
import main.model.CurrentAccount;
import main.model.SavingsAccount;

public abstract class AccountUtils {
	
	
	public static String generateCode() {
		Random random = new Random();
		
		int number = 10000 + random.nextInt(90000);
        return "CPT-" + number;
	}	
	
	public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
	
}
