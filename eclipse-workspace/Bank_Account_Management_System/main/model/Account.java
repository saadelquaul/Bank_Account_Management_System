package main.model;

public abstract class Account {

	private String code;
	private float balance;
	private OperationService[] Operations;
	
	
	public Account(float balance) {
		this.balance = balance;
	}
	
	
	public OperationService[] getOperations() {
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


	public void setOperations(OperationService[] operations) {
		Operations = operations;
	}


	public abstract boolean withdraw(float amount);
	public abstract void displayDetails();
	public abstract float calculateInterest();

}
