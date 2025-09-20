package main.model;

public class Withdrawal extends Operation {
	private String destination;
	
	
	public Withdrawal(float amount, String destination) {
		
		super(amount);
		this.destination = destination;
		
		
	}
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
    public String showDetails() {
        return "[Withdraw] " + this.getAmount() + " DH by " + destination + " - " + this.getDate();
    }
}
