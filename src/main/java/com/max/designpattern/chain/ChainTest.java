package com.max.designpattern.chain;

/**
 * <p>
 * <b>DESIGN PATTERN 16: Chain of Responsibility pattern</b> <br>
 * There are many handlers, Client don't need to care about them, just call a
 * public method. Handlers can delegate to each other based on logic, it is a
 * dark box to client.
 * </p>
 * 
 * @author 23885_000
 *
 */
public class ChainTest {
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");

		h1.setHandler(h2);
		h2.setHandler(h3);

		h1.operator();
	}
}
