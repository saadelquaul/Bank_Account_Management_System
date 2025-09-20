package main.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Operation {
	private String number;
	private LocalDateTime date;
	private float amount;
	
	public Operation(float amount) {
		this.amount = amount;
		this.date =  LocalDateTime.now();
		this.number = UUID.randomUUID().toString();
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public abstract String showDetails();
	
	
}
