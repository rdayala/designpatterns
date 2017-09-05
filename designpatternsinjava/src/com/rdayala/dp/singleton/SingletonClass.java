package com.rdayala.dp.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

import javax.management.RuntimeErrorException;

// Lazy initialization - the creation of instance happens inside static method.
// This implementation works fine for single threaded environments. Not suitable for multi-threaded environments.

public class SingletonClass implements Cloneable, Serializable {
	// static variable
	private static SingletonClass singletonObj = null;
	
	// private constructor
	private SingletonClass(){
		// reflection issue
		// fix : Throw Runtime Exception if someone tries to make instance 
		// in case one instance already exists.
		if(singletonObj != null){
			throw new RuntimeException("Can't create instance. Instead use getInstance() method");
		}
	}
	
	// public getInstance() method which returns the Singleton class object
	public static SingletonClass getInstance() {
		if(singletonObj == null){
			singletonObj = new SingletonClass();
		}
		return singletonObj;
	}
	
	// Cloning issue
	// If we try to make instance by cloning it, the generated hash code of cloned
	// copy doesn’t match with the actual object so it also violates the Singleton principle
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Cloning issue fix :
		// Throw CloneNotSupportedException from the clone () method 
		// if someone tries to make other instance of it.
		if(singletonObj != null){
			throw new CloneNotSupportedException();
		}
		return super.clone();
	}
	
	// Serialization/Deserialization Issue: 
	// When we serialize an object and deserialize it again there are different hash code values 
	// generated. So our Singleton principle breaks in case of object serialization/deserialization.
	// Fix : Implement readResolve () method in the Singleton class.
	private Object readResolve() {
		return singletonObj;
	}
	
	public void sayHello(){
		System.out.println("This is Singleton Class!!");
	}

}

/*
Reflection issue :
Using this simple implementation, we can easily hack the singleton using reflection like below:

		Class clazz = Class.forName("com.rdayala.dp.singleton.SingletonClass");
		Constructor<SingletonClass> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		SingletonClass obj3 = ctor.newInstance();
		
		print("obj3", obj3);
		obj3.sayHello();

This can create a new instance of the Singleton class.
Fix : Throw Runtime Exception if someone tries to make instance in case one
instance already exists. This code will go into the private constructor of the Singleton class.

Cloning issue :
If we try to make instance by cloning it, the generated hash code of cloned
copy doesn’t match with the actual object so it also violates the Singleton principle.
Fix : Throw CloneNotSupportedException from the clone () method if someone tries to make other instance of it.

Serialization/Deserialization : 
When we serialize an object and deserialize it again there are different hash code values 
generated. So our Singleton principle breaks in case of object serialization/deserialization.
Fix : Implement readResolve () method in the Singleton class.
*/
