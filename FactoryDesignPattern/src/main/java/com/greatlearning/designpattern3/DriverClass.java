package com.greatlearning.designpattern3;

import java.util.Scanner;

public class DriverClass {

	public static void main(String [] args) {
	
		System.out.println("Currency COnversion Program");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter currency (USR/GBP) to covert to INR:: ");  
		String currency= sc.nextLine();
		System.out.print("Enter amount in USD :: ");  
		double amount= sc.nextDouble();
    
		switch(currency) {
		case "USD":
			Currency usdToRupeeConv =CurrencyFactory.createCurrency(currency.toString());
			System.out.println("Converted amount in\t" +usdToRupeeConv.getCode() +"\t:\t"+ usdToRupeeConv.getSign() +""+ usdToRupeeConv.getValue(amount));    	 
			break;
    
		case "GBP":
			Currency gbpToRupeeConv =CurrencyFactory.createCurrency(currency.toString());
			System.out.println("Converted amount in\t" +gbpToRupeeConv.getCode() +"\t:\t"+ gbpToRupeeConv.getSign() +""+ gbpToRupeeConv.getValue(amount));
   	 		break;
   	 	
   	 	default:
   	 		System.out.println("Currency you entered is not valid ... Please re-try");
   	 		break;
		}
   
	}
}
