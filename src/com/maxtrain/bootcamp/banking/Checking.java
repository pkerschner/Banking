package com.maxtrain.bootcamp.banking;

public class Checking extends Account {
	
	private int numberOfChecks;
	
	public void writeCheck(int checkNo, double amount) throws Exception {
		withdraw(amount);
		numberOfChecks++;
	}
	
	public Checking (String description) {
		super(description);
		this.setNumberOfChecks(0);
	}
	
	public String toString() {
		return super.toString() + "\nchecks= " + numberOfChecks;
	}
	
	public int getNumberOfChecks() {
		return this.numberOfChecks;
	}
	private void setNumberOfChecks(int numberOfChecks) {
		this.numberOfChecks = numberOfChecks;
	}

}
