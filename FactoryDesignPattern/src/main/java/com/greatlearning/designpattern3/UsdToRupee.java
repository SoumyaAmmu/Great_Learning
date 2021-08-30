package com.greatlearning.designpattern3;

public class UsdToRupee implements Currency {

	private static double usDollor=73.50;
	
	
	public double getValue(double amt) {
		return amt*usDollor;
	}

	public String getSign() {
		return "Rs";
	}
	
	public String getCode() {
		return "INR";
	}

	
}
