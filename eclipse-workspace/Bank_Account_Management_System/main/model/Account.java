package main.model;

import java.util.ArrayList;
import java.util.List;

import main.service.OperationService;
import main.utils.AccountUtils;

public abstract class Account {

	private String code;
	private float balance;
	private List<OperationService> Operations;
	
	
	public Account(String code, float balance) {
		this.code = code;
		this.balance = balance;
		this.Operations = new ArrayList<>();
		
	}
	
	public Account(float balance) {
		
		this.code =  AccountUtils.generateCode();
		this.Operations = new ArrayList<>();
		
	}
	
	
	public List<OperationService> getOperations() {
		return Operations;
	}


	public String getCode() {
		return code;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	public void setOperations(OperationService operation) {
		Operations.add(operation);
	}


	public abstract boolean withdraw(float amount);
	public abstract void displayDetails();
	public abstract float calculateInterest();

}
