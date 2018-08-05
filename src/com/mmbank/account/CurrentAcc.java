//Class to hold instance of current account
package com.mmbank.account;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit = 15000f;

	//Initialize current account details
	public CurrentAcc(int accNo, String accHolderName, int accBal) {
		super(accNo, accHolderName, accBal);
	}

	abstract public void withdraw(float amount);  //Abstract withdraw method

	//Display current account details
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + getCreditLimit() + ", toString()=" + super.toString() + "]";
	}

	//Get credit limit
	public float getCreditLimit() {
		return creditLimit;
	}

}
