//Abstract class to club model and view
package com.mmbank.controller;

import com.mmbank.account.BankAcc;
import com.mmbank.collection.BankAccCollection;
import com.mmbank.factory.BankFactory;

public abstract class BankController {
	
	private BankAccCollection bc;
	private BankFactory bf;
	
	public BankController(BankFactory bf) {
		this.bf = bf;
	}
	
	//Abstract methods to be defined in child classes
	abstract public void createNewCurrentAccount(int accNo, String accHolderName, int accBal);
	abstract public void createNewSavingAccount(int  accNo, String accHolderName, int accBal, boolean isSalaried);
	abstract public BankAcc presentAccountToView(int accNo, String str);

}
