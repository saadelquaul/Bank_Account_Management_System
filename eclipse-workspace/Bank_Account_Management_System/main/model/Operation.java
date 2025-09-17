package main.model;

import java.util.Date;
import java.util.UUID;

import main.service.OperationService;

public abstract class Operation implements OperationService {
	private UUID number;
	private Date date;
	private float montant;
	
	public Operation(float montant) {
		this.montant = montant;
		this.date = new Date();
		this.number = UUID.randomUUID();
	}
	
	
	public String getNumber() {
		return number.toString();
	}
	
	public Date getDate() {
		return date;
	}
	
	public float getMontant() {
		return montant;
	}
	
	
	
}
