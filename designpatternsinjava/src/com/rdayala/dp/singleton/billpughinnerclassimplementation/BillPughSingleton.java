package com.rdayala.dp.singleton.billpughinnerclassimplementation;

// This is the most widely used approach for Singleton class as it doesn’t require synchronization.
// Create the Singleton class using a inner static helper class.

public class BillPughSingleton {
	
	private BillPughSingleton() {
	}

	// private static inner class
	// this static helper inner class contains the instance of the single class

	// When the singleton class is loaded, SingletonHelper class is not loaded into memory 
	// and only when someone calls the getInstance() method, this class gets loaded and creates the Singleton class instance. 
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
