package com.rdayala.dp.factory;

public class FactoryClient {

	public static void main(String[] args) {

		// we coded to an interface
		// Factory pattern provides approach to code for interface rather than implementation.
		// creating concrete implementations using factory method
		Currency currency = CurrencyFactory.getCurrencyByCountry("IN");
		System.out.println(currency.getCurrency());
		
		currency = CurrencyFactory.getCurrencyByCountry("USA");
		System.out.println(currency.getSymbol());
	}

}
