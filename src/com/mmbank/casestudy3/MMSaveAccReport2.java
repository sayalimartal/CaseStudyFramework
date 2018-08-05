//Report printing for all accounts with format of report-II
package com.mmbank.casestudy3;

import java.util.ArrayList;
import com.mmbank.collection.BankAccCollection;

public class MMSaveAccReport2 implements AccReport {
	
	public void printReport() {
		
		System.out.println("REPORT 2 format");
		ArrayList al = BankAccCollection.listAll();
		al.stream().forEach(System.out::println);
		
	}

}
