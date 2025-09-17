package main.model;

import java.util.List;

public abstract class Account {

	private String code;
	private float balance;
	private List<OperationService> Operations;
	
	
	public Account(float balance) {
		this.balance = balance;
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
