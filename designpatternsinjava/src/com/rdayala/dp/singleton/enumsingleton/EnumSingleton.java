package com.rdayala.dp.singleton.enumsingleton;

// drawback : it does not allow lazy initialization.
public enum EnumSingleton {

	INSTANCE;

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
