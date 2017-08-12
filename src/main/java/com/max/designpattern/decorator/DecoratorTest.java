package com.max.designpattern.decorator;

/**
 * <p>
 * <b>DESIGN PATTERN 7: Decorator pattern</b> Dynamically add new functions or
 * new method for an instance.
 * </p>
 * Usually Decorator and Source needs to implement the same interface. <br>
 * Drawback is too many similar classes.
 * 
 * @author 23885_000
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
