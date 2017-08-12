package com.max.designpattern.observer;
/**
 * <p>
 * <b>DESIGN PATTERN 15: Observer pattern</b> <br>
 * </p>
 * 
 * @author 23885_000
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}
}
