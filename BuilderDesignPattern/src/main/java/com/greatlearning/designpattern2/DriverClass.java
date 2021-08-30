package com.greatlearning.designpattern2;

public class DriverClass {

	public static void main(String[] args) {
		BankAccount account = new BankAccount.Builder(1234L)
	            .withAccountType("Savings")
	            .atBranch("Springfield")
	            .balance(100)
	            .build();

		BankAccount anotherAccount = new BankAccount.Builder(4567L)
	            .withAccountType("Homer")
	            .atBranch("Springfield")
	            .balance(100)
	            .atmTransactions(2500)
	            .emiSchedule(3)
	            .build();
		
		System.out.println("1 --> \naccount number :"+account.accountNumber +"\naccount type"+account.accountType+"\nBranch"+account.branch+"\nBalance:"+account.balance);
		System.out.println("");
		System.out.println("2 --> \naccount number :"+anotherAccount.accountNumber +"\naccount type"+anotherAccount.accountType+"\nBranch"+anotherAccount.branch+"\nBalance:"+anotherAccount.balance+"\nEMI Transactions"+anotherAccount.getEmiSchedule()+"\nATM Transaction"+anotherAccount.atmTransactions);

	}

}
