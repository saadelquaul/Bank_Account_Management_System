package main.model;

public class CurrentAccount extends Account {
	
	private float overDraft = 500;
	
	public CurrentAccount(float balance) {
		super(balance);;
	}

	
	public float getOverDraft() {
		return overDraft;
	}
	
	
	@Override
	public boolean withdraw(float amount) {
		if ( this.getBalance() - amount >= -overDraft) {
			
			this.setBalance(-amount);
			setOperations(new Withdrawal(amount,"Distributeur ATM"));
			return true;
		}
		return false;
	}

	@Override
	public void displayDetails() {
		
		

	}

	@Override
	public float calculateInterest() {
		
		return 0;
	}

}
