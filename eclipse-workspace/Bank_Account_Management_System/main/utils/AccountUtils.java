package main.utils;

import java.util.List;
import java.util.Random;

import main.model.Account;
import main.model.CurrentAccount;

public abstract class AccountUtils {
	
	
	public static String generateCode() {
		Random random = new Random();
		
		int number = 10000 + random.nextInt(90000);
        return "CPT-" + number;
	}	
	
	public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
	
	public static boolean isValidInterestRate(double taux) {
        return taux > 0;
    }
	
	public static List<Account> stringListToAccountList(List<String> AccountsStringList) {
		
		
		for(int i = 0; i < AccountsStringList.size(); i++) {
			
		}
		
	}
	
	public static Account stringLineToAccountObject(String line) {
		
		String[] lineContent = seperateLine(line);
		
		if(lineContent[0] == "CurrentAccount") {
			return new CurrentAccount();
		}
	}
	
	public static String[] seperateLine(String line) {
		
		return line.split("//"); 
		
	}
	
	public static String accountToString(Account Acc) {
		
		String accountString = Acc.getCode() + "//" + Acc.getBalance() ;
		return accountString;
	}
}
