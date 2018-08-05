package com.mmbank.casestudy3;

import java.util.ArrayList;
import com.mmbank.collection.BankAccCollection;

public class MMSaveAccReport1 implements AccReport {
	
	public void printReport() {
		
		System.out.println("IN REPORT 1");
		ArrayList al = BankAccCollection.listAll();
		al.stream().forEach(System.out::println);
		
	}

}
