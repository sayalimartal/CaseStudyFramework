//Collection to store all bank accounts
package com.mmbank.collection;

import java.util.ArrayList;

import com.mmbank.account.BankAcc;

public class BankAccCollection {
	
	public static ArrayList<BankAcc> al=new ArrayList<>();
	
	public void addNewAccount(BankAcc bankAcc) { //Add new bank account
		al.add(bankAcc);
	}
	
	public static ArrayList<BankAcc> listAll() { //Return all bank accounts
		return al;
	}

}
