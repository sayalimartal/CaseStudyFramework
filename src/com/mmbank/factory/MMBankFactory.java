package com.mmbank.factory;

import com.mmbank.account.CurrentAcc;
import com.mmbank.account.MMCurrentAcc;
import com.mmbank.account.MMSavingAcc;
import com.mmbank.account.SavingAcc;

public class MMBankFactory extends BankFactory {
	
	//Create new MMSavingAcc
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accHolderName, int accBal, boolean isSalaried) {
		SavingAcc savingAcc = new MMSavingAcc(accNo, accHolderName, accBal, isSalaried);
		return savingAcc;
	}

	//Create new MMCurrentAcc
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accHolderName, int accBal) {
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accHolderName, accBal);
		return currentAcc;
	}

}
