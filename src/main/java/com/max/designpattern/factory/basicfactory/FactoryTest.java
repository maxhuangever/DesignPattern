package com.max.designpattern.factory.basicfactory;

/**
 * DESIGN PATTERN 1: Factory pattern
 * 
 * Creation service for classes which implements the same interface. Method of
 * factory class can be static.
 * 
 * @author 23885_000
 *
 */
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = new SenderFactory().produce("mail");
		sender.send();
	}
}
