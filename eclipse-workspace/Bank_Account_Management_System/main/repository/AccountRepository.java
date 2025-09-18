package main.repository;

import main.model.Account;
import main.utils.AccountUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public abstract class AccountRepository {
	
	private static File accountsData = null;
	private final static String fileUri = "C:\\Users\\safiy\\eclipse-workspace\\Bank_Account_Management_System\\main\\Accounts.txt";
	
	
	public static boolean save(Account account) {
		
		String accInfo = AccountUtils.accountToString(account);
		
		try {
			Files.write(Paths.get(fileUri), accInfo.getBytes(),
					   StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		return false;
	}
	
	public static Account findByCode(String code) {
		
			return null;
		
	}
	
	public static List<String> getAllAccounts() {
		
		try {
			File accountsFile = new File(fileUri);
			if(accountsFile.createNewFile()) {
				
				return  null;
				
			}else {
				
				List<String> accountsContent = Files.readAllLines(Paths.get("C:\\Users\\safiy\\eclipse-workspace\\Bank_Account_Management_System\\main\\Accounts.txt"));
				
				return accountsContent;
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	

}
