package com.max.designpattern.singleton;

/**
 * DESIGN PATTERN 3: Singleton always return the same instance, should be thread
 * safe.
 * 
 * @author 23885_000
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.sayHello();// com.max.designpattern.singleton.Singleton@4eb09321

		Singleton s2 = Singleton.getInstance();
		s2.sayHello();// com.max.designpattern.singleton.Singleton@4eb09321

		System.out.println(s1 == s2);
	}

}
