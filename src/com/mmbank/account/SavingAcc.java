//Class to hold instance of Savings account
package com.mmbank.account;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private static final float MINBAL = 8000;

	public SavingAcc(int accNo, String accHolderName, int accBal, boolean isSalaried) {
		super(accNo, accHolderName, accBal);
		this.setSalaried(isSalaried);
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	public abstract void withdraw(float amount); //Abstract withdraw method

	//Display Savings Account Details
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried() + ", toString()=" + super.toString() + "]";
	}

}
