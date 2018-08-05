package com.mmbank.test;

import java.util.Scanner;

import com.mmbank.casestudy3.MMNewSaveAccEntryConsole;
import com.mmbank.casestudy3.MMSaveAccReport1;
import com.mmbank.casestudy3.MMSaveAccReport2;
import com.mmbank.casestudy3.NewSavingPojo;
import com.mmbank.controller.BankController;
import com.mmbank.controller.MMBankController;
import com.mmbank.factory.BankFactory;
import com.mmbank.factory.MMBankFactory;

public class EntryPoint {

	public static void main(String[] args) {

		BankFactory mmBankFactory = new MMBankFactory();
		BankController mmBankController = new MMBankController(mmBankFactory);

		mmBankController.createNewCurrentAccount(101, "Sayali", 5000);
		mmBankController.createNewSavingAccount(101, "Sayali", 250000, true);

		Scanner scanner = new Scanner(System.in);
		System.out.println("---------CONSOLE---------");
		System.out.println("Enter account number");
		int accNo = scanner.nextInt();
		
		scanner.close();
		MMNewSaveAccEntryConsole a = new MMNewSaveAccEntryConsole();
		NewSavingPojo newSavingPojo = a.readAccInfo(accNo);
		System.out.println(newSavingPojo);

		MMSaveAccReport1 m1 = new MMSaveAccReport1();
		m1.printReport();
		
		MMSaveAccReport2 m2 = new MMSaveAccReport2();
		m2.printReport();
	}

}
