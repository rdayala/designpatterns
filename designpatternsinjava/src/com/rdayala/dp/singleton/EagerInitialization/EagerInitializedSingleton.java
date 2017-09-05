package com.rdayala.dp.singleton.EagerInitialization;


/*

In eager initialization, the instance of Singleton Class is created 
at the time of class loading, this is the easiest method to create a singleton class.
But it has a drawback that instance is created even though client application might not be using it.

Say, if for example the Singleton class may throw an exception while creating its own object, then 
if we use this eager initialization, we may not be able to handle the exception.

*/
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}

// Note: If your singleton class is not using a lot of resources, this is the approach to use.
// However, generally this is not preferred
