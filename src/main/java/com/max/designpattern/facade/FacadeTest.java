package com.max.designpattern.facade;

/**
 * <p>
 * <b>DESIGN PATTERN 9: Facade pattern</b> <br>
 * Just like a facade, manages
 * relationship(or dependency) between different classes, reduce the complexity
 * of client.
 * </p>
 * 
 * @author 23885_000
 *
 */
public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
