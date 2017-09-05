package com.rdayala.dp.singleton.threadsafe.synchronizedmethod;

/*

The easier way to create a thread-safe singleton class is to 
make the global access method synchronized, so that only one thread 
can execute this method at a time.

*/

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}

// Above implementation works fine and provides thread-safety but it 
// reduces the performance because of cost associated with the synchronized method.