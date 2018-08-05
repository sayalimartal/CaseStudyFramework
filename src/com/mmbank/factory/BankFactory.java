//To handle new savings and current accounts
package com.mmbank.factory;

import com.mmbank.account.CurrentAcc;
import com.mmbank.account.SavingAcc;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAcc(int accNo, String accHolderName, int accBal, boolean isSalaried); 
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accHolderName, int accBal); 

}
