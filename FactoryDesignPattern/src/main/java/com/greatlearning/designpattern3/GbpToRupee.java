package com.greatlearning.designpattern3;

public class GbpToRupee implements Currency{

	private static double gbPound=101.17;
				
	public double getValue(double amt) {
		return amt*gbPound;
	}

	public String getSign() {
		return "Rs";
	}
	
	public String getCode() {
		return "INR";
	}
}
