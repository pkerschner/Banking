package com.maxtrain.bootcamp.banking;

public class Savings extends Account {
	
	private double interestRate = .12;
	
	public void calculateAndPayInterest(int months) throws Exception {
		if(months <= 0) {
			throw new Exception("Months must be GT zero");
		}
		var interestToBePaid = getBalance() * (getInterestRate() / 12) * months;
		try {
			deposit(interestToBePaid);
		} catch(Exception ex) {}
	}
	
	public Savings(String description) {
		super(description);
		setAccountNo(getAccountNo() + 10000);
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(double interestRate) throws Exception {
		if(interestRate < 0) {
			throw new Exception("Interest rate cannot be negative");
		}
		this.interestRate = interestRate;
	}
}
