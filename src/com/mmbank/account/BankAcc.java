//Abstract bank account class to hold a bank account instance
package com.mmbank.account;

public abstract class BankAcc {
	
	//Instance members
	private int accNo;
	private String accHolderName;
	private float accBal;
	
	public BankAcc(int accNo, String accHolderName, float accBal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	abstract public void withdraw(float amount);  //Abstract withdraw method

	public void deposit(float amount) {  //Deposit amount to account
		this.accBal += amount;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accBal=" + accBal + "]";
	}
	
	

}
