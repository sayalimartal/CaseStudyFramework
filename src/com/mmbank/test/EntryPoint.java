//Entry point class to test MM bank functionalities
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

		BankFactory mmBankFactory = new MMBankFactory(); //Instance of MMBankFactory
		BankController mmBankController = new MMBankController(mmBankFactory); //Instance of MMBankController

		mmBankController.createNewCurrentAccount(101, "Sayali", 5000);  //Create new current and savings accounts
		mmBankController.createNewSavingAccount(103, "Sayali", 250000, true);

		Scanner scanner = new Scanner(System.in);
		System.out.println("---------CONSOLE---------");
		System.out.println("Enter account number");
		int accNo = scanner.nextInt();
		
		scanner.close();
		MMNewSaveAccEntryConsole entryConsole = new MMNewSaveAccEntryConsole();
		NewSavingPojo newSavingPojo = entryConsole.readAccInfo(accNo);
		System.out.println(newSavingPojo);

		MMSaveAccReport1 report1 = new MMSaveAccReport1(); 
		report1.printReport();  //Print report of format report-I
		
		MMSaveAccReport2 report2 = new MMSaveAccReport2();
		report2.printReport();  //Print report of format report-II
	}

}