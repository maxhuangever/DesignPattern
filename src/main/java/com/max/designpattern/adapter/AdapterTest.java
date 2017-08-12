package com.max.designpattern.adapter;

/**
 * <p>
 * <b>DESIGN PATTERN 6: Adapter pattern</b> Convert one class to another
 * interface.
 * </p>
 * To do this, it must implement the new method in target interface. For method
 * that source already has, Adapter class has 3 different ways to reuse:
 * <ol>
 * <li>it can extends Source class;</li>
 * <li>it can refer instance of Source;</li>
 * <li>Add an abstract class to implement interface, all methods in abstract
 * class can be empty. Adapter class only need to implement methods it
 * want.</li>
 * </ol>
 * 
 * @author 23885_000
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
