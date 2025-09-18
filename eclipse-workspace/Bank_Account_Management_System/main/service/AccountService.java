package main.service;

import main.model.CurrentAccount;
import main.repository.AccountRepository;
import main.ui.DisplayScreen;

public abstract class AccountService {
	
	public static void CreateCurrentAccount(float balance) {
		
		CurrentAccount CurrentAcc = new CurrentAccount(balance);
		AccountRepository.save(CurrentAcc);
		System.out.print("\n\n*********************\n"
				+ "Your Account Created Successfully!\n"
				+ "Your Account Code is : ");
		System.out.print(CurrentAcc.getCode());
		DisplayScreen.mainMenu();
		
	}
	
	

}
