package main.model;

public class SavingsAccount extends Account {

	private float interestRate = 0.2f;
	
	public SavingsAccount(float balance) {
		
		super(balance);
	}
	
	public float getInterestRate() {
		
		return interestRate;
	}
	
	@Override
	public boolean withdraw(float amount) {
		
		if(this.getBalance() >= amount) {
			setBalance(-amount);
		}
		return false;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
