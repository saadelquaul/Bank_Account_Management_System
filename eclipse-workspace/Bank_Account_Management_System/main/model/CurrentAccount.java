package main.model;


public class CurrentAccount extends Account {
	
	private float overDraft = 500;


	public CurrentAccount(String code, float balance, float overDraft) {
		super(code, balance);
		this.overDraft = overDraft;
	}
	
	public float getOverDraft() {
		return overDraft;
	}
	
	
	@Override
	public void withdraw(float amount) {
		
		if (balance - amount >= -overDraft) {
			balance -= amount;
            operations.add(new Withdrawal(amount, "ATM"));
        } else {
            System.out.println("❌ Withdrawal refused: overdraft limit reached.");
        }
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Current Account [" + code + "] - Account balance : " + balance + " - OverDraft : " + overDraft);

	}

	@Override
	public float calculateInterest() {
		
		return 0;
	}

}
