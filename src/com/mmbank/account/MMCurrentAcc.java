//MMBank current account 
package com.mmbank.account;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accHolderName, int accBal) {
		super(accNo, accHolderName, accBal);
		}
	
	@Override
	public void withdraw(float amount) {   //Overriding withdraw method for current account
		if (((getAccBal() + getCreditLimit()) - amount) >= 0)
			setAccBal(getAccBal() - amount);
		else {
			System.out.println("Withdrawal Failed");
		}	
	}


	//Display MMCurrentAcc details
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccNo()=" + getAccNo() + ", getAccHolderName()=" + getAccHolderName() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}