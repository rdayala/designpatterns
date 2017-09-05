package com.rdayala.dp.singleton.enumsingleton;

public class EnumSingletonDemo {

	public static void main(String[] args) {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		
		System.out.println(singleton1.getValue()); // default value : 0
		
		singleton2.setValue(2);
		
		System.out.println(singleton1.getValue()); // 2
		System.out.println(singleton2.getValue()); // 2
	}

}

// Note:
// One thing to remember here is, when serializing an enum, 
// field variables are not getting serialized. 
// For example, if we serialize and deserialize the SingletonEnum class, 
// we will lose the value of the int value field.