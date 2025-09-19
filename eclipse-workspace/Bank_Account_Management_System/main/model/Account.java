package main.model;

import java.util.ArrayList;
import java.util.List;

import main.service.OperationService;

public abstract class Account {

	protected String code;
	protected float balance;
	protected List<Operation> operations;
	
	
	public Account(String code, float balance) {
		this.code = code;
		this.balance = balance;
		this.operations = new ArrayList<>();
		
	}
	
	
	public List<Operation> getOperations() {
		return operations;
	}


	public String getCode() {
		return code;
	}


	public float getBalance() {
		return balance;
	}


	public void setOperations(Operation operation) {
		operations.add(operation);
	}

	public void Deposit(float amount) {
		this.balance += amount;
		this.operations.add(new Deposit(amount, "Cash deposit"));
	}
	
	public abstract void withdraw(float amount);
	public abstract void displayDetails();
	public abstract float calculateInterest();
	

}
