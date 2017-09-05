package com.rdayala.dp.factory;

public class CurrencyFactory {

	// static factory method
	public static Currency getCurrencyByCountry(String countryCode) {

		if ("IN".equalsIgnoreCase(countryCode)) {
			return new India();
		} else if ("USA".equalsIgnoreCase(countryCode)) {
			return new USA();
		}
		return null;
	}

}
