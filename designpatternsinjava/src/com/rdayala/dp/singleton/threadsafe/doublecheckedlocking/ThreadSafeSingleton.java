package com.rdayala.dp.singleton.threadsafe.doublecheckedlocking;

/*

To avoid using synchronized method, double checked locking principle is used. 
In this approach, the synchronized block is used inside the if condition 
with an additional check to ensure that only one instance of singleton class is created. 

*/
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
