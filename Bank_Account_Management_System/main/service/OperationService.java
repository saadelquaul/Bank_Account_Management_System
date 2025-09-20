package main.service;

import main.model.Account;
import main.model.Operation;

public class OperationService {
	
	public void showOperations(Account account) {
        System.out.println("Account transaction history " + account.getCode());
        for (Operation op : account.getOperations()) {
            op.showDetails();
        }
    }

}
