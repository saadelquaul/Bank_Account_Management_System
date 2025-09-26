package main.service;

import java.util.HashMap;
import java.util.Map;

import main.model.Account;
import main.model.CurrentAccount;
import main.model.SavingsAccount;
import main.utils.AccountUtils;

public class AccountService {
	
	private Map<String, Account> accounts = new HashMap<>();
	private float MaxBalance = 0;
	
	public Account createCurrentAccount(float initialDeposit, float overDraft) {
		{
	        if (!AccountUtils.isValidAmount(initialDeposit)) {
	            throw new IllegalArgumentException("Invalid initial amount.");
	        }
	        String code = AccountUtils.generateCode();
	        Account account = new CurrentAccount(code, initialDeposit, overDraft);
	        accounts.put(code, account);
	        return account;
	    }
	}
	
	public Account createCompteEpargne(float initialDeposit, float interestRate) {
        if (!AccountUtils.isValidAmount(initialDeposit)) {
            throw new IllegalArgumentException("Invalid initial amount.");
        }
        String code = AccountUtils.generateCode();
        Account compte = new SavingsAccount(code, initialDeposit, interestRate);
        accounts.put(code, compte);
        return compte;
    }
	
	
	public Account getAccount(String code) {
        return accounts.get(code);
    }
	
	 public void transfer(String fromCode, String toCode, float amount) {
	        Account from = accounts.get(fromCode);
	        Account to = accounts.get(toCode);

	        if (from != null && to != null) {
	            from.withdraw(amount);
	            to.Deposit(amount);
	            System.out.println("Transfer made from " + fromCode + " to " + toCode);
	        } else {
	            System.out.println("Invalid accounts.");
	        }
	    }
	
	public float findMaxBalance() {
		
		accounts.values().forEach(a -> {
			if(a.getBalance() > MaxBalance) { MaxBalance = a.getBalance();}
			
		});
		
		return MaxBalance;
		
		
	}

}
