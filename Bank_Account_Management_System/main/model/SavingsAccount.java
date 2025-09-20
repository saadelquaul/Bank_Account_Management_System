package main.model;

public class SavingsAccount extends Account {

	private float interestRate = 0.2f;
	
	public SavingsAccount(String code, float balance, float interestRate) {
		
		super(code, balance);
		this.interestRate = interestRate;
		
	}
	
	public float getInterestRate() {
		
		return interestRate;
	}
	
	@Override
	public void withdraw(float amount) {
		
		if (balance >= amount) {
            balance -= amount;
            operations.add(new Withdrawal(amount, "Cash withdrawal"));
        } else {
            System.out.println("❌ Withdrawal refused: insufficient balance.");
        }
	}

	@Override
	public void displayDetails() {
		System.out.println("Savings Account [" + code + "] - Account Balance : " + balance + " - Interest Rate : " +interestRate + "%");
	}

	@Override
	public float calculateInterest() {
		return this.getBalance() * interestRate / 100;
	}

}
