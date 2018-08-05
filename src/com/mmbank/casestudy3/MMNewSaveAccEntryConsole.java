package com.mmbank.casestudy3;

import com.mmbank.account.BankAcc;
import com.mmbank.controller.MMBankController;

public class MMNewSaveAccEntryConsole implements NewAccEntry{
	
	@Override
	public NewSavingPojo readAccInfo(int accNm) {
		
		MMBankController mmBankController = new MMBankController(null); 
		String str = "com.mmbank.account.MMSavingAcc";
		BankAcc ba = mmBankController.presentAccountToView(accNm, str);
		NewSavingPojo newSavingPojo = new NewSavingPojo(ba.getAccHolderName(),ba.getAccNo(),ba.getAccBal());
		return newSavingPojo;
	}

}
