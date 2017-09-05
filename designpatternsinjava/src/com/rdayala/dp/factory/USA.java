package com.rdayala.dp.factory;

public class USA implements Currency {

	@Override
	public String getCurrency() {
		return "Dollar";
	}

	@Override
	public String getSymbol() {
		return "$";
	}
}
