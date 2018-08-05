package com.mmbank.account;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accHolderName, int accBal, boolean isSalaried) {
		super(accNo, accHolderName, accBal, isSalaried);
	}

	@Override
	public void withdraw(float amount) {
		
		if (isSalaried()) {
			if ((getAccBal() - amount) >= 0)
				setAccBal(getAccBal() - amount);
			else 
				System.out.println("Failed");
		} 
		else {
			if ((getAccBal() - amount) >= getMinbal())
				setAccBal(getAccBal() - amount);
			else
				System.out.println("Failed");
		}
	}

	//Display savings account details
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccHolderName()=" + getAccHolderName() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
		
}