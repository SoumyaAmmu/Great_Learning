package com.greatlearning.designpattern2;

public class BankAccount {

    public long accountNumber;
	public String accountType;
	public String branch;
	public double balance;
	public double atmTransactions;
	private double emiSchedule;

	public static class Builder {

        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String accountType;
        private String branch;
        private double balance;
        private double atmTransactions;
        private double emiSchedule;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withAccountType(String accountType){
            this.accountType = accountType;

            return this; 
        }

        public Builder atBranch(String branch){
            this.branch = branch;

            return this;
        }

        public Builder balance(double balance){
            this.balance = balance;

            return this;
        }

        
        
        public Builder atmTransactions(double atmTransactions){
            this.atmTransactions = atmTransactions;

            return this;
        }

        public Builder emiSchedule(double emiSchedule){
            this.emiSchedule = emiSchedule;

            return this;
        }
        
        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.accountType = this.accountType;
            account.branch = this.branch;
            account.balance = this.balance;
            account.atmTransactions = this.atmTransactions;
            account.emiSchedule(this.emiSchedule);

            return account;
        }
    }

	private BankAccount() {
		
	}
    
	public void emiSchedule(double emiSchedule2) {
		// TODO Auto-generated method stub
		
	}

	private BankAccount(String accountType,String branch,double balance) {
    	accountType=this.accountType;
    	branch=this.branch;
    	balance=this.balance;
    }

	public double getEmiSchedule() {
		return emiSchedule;
	}

	public void setEmiSchedule(double emiSchedule) {
		this.emiSchedule = emiSchedule;
	}

	

}
