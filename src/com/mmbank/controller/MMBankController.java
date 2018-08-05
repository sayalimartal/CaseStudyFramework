//MMBank Controller providing controller features
package com.mmbank.controller;

import com.mmbank.account.BankAcc;
import com.mmbank.collection.BankAccCollection;
import com.mmbank.factory.BankFactory;

public class MMBankController extends BankController{
	
	private BankAccCollection bc;
	private BankFactory bf;
	
	public MMBankController(BankFactory bf) {
		super(bf);
		this.bf = bf;
		bc = new BankAccCollection();
	}
	
	//Create new Savings Account
	@Override
	public void createNewSavingAccount(int accNo, String accHolderName, int accBal, boolean isSalaried) {
		BankAcc bankAcc = bf.getNewSavingAcc(accNo, accHolderName, accBal, isSalaried);
		bc.addNewAccount(bankAcc);
	}
	
	//Create new Current Account
	@Override
	public void createNewCurrentAccount(int accNo, String accHolderName, int accBal) {
		BankAcc bankAcc = bf.getNewCurrentAcc(accNo, accHolderName, accBal);
		bc.addNewAccount(bankAcc);
	}
	
	//Return specified account details to view
	@Override
	public BankAcc presentAccountToView(int accNo, String str) {
		
		BankAcc bankAcc = null;
		
		for(BankAcc ba: bc.al) {
			if(ba.getAccNo() == accNo && ba.getClass().getName().equals(str)) {
				bankAcc = ba;
			}
		}
		return bankAcc;
	}

}