package com.rdayala.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SingletonClassTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {

		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		print("obj1", obj1);
		print("obj2", obj2);

		// reflection issue
		// hacking the simple singleton implementation using Reflection
		// Using reflection we can set the private constructor to become accessible 
		// at runtime as shown in the example below.
		
		/*
		Class clazz = Class.forName("com.rdayala.dp.singleton.SingletonClass");
		Constructor<SingletonClass> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		SingletonClass obj3 = ctor.newInstance(); 
		*/
					
//		Method methodzz = clazz.getDeclaredMethod("getInstance");
//		SingletonClass obj3 = (SingletonClass) methodzz.invoke(null);
//		obj3.sayHello();
		
		// Cloning issue
		// If we try to make instance by cloning it, the generated hash code of cloned
		// copy doesn’t match with the actual object so it also violates the Singleton principle
		// Fix : Throw CloneNotSupportedException from the clone () method 
		// if someone tries to make other instance of it.
//		SingletonClass obj3 = (SingletonClass)obj2.clone();		
//		print("obj3", obj3);
		
	}
	
	static void print(String name, SingletonClass obj){
		System.out.println(String.format("Object: %s, Hashcode: %d", name, obj.hashCode()));
	}

}
