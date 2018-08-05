//Report printing for all accounts with format of report-I
package com.mmbank.casestudy3;

import java.util.ArrayList;
import com.mmbank.collection.BankAccCollection;

public class MMSaveAccReport1 implements AccReport {
	
	public void printReport() {
		
		System.out.println("REPORT 1 format");
		ArrayList al = BankAccCollection.listAll();
		al.stream().forEach(System.out::println);
		
	}

}
