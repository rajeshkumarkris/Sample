package org.company;

import org.client.Client;

public class CompanyInfo extends Client{
	public void companyName () {
		System.out.println("Hexaware Technologies");
	}
	public void companyId () {
		System.out.println ("1265974563");
	}
	public void companyAddress () {
		System.out.println( "Chenani One, Phase 3, Thoraipakkam");
	}
	public static void main (String [] args) {
		CompanyInfo print = new CompanyInfo ();
		print.companyName();
		print.companyId();
		print.companyAddress();
		print.clientInfo();
	}
}
