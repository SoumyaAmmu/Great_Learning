package com.greatlearning.designpattern3;

public class CurrencyFactory {
	
	public static Currency createCurrency(String country) {
		       
	    if(country.equalsIgnoreCase(CurrencyConversion.USD.toString())) {
	      return new UsdToRupee();
	    } else if(country.equalsIgnoreCase(CurrencyConversion.GBP.toString())) {
	      return new GbpToRupee();
	    }
	    throw new IllegalArgumentException(String.format("No currency found for '%s'", country));
	  }
}
