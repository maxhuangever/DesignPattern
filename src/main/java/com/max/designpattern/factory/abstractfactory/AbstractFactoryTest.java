package com.max.designpattern.factory.abstractfactory;

/**
 * DESIGN PATTERN 2: Abstract pattern
 * Factory class implements same interface.
 * So if there is new classes to be created by factory, there is no need to 
 * modify existing factory, but just add a new factory which implements the 
 * interface.
 * 
 * @author 23885_000
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		Provider provider = new MailSenderFactory();
		provider.produce().send();
		
		provider = new SmsSenderFactory();
		provider.produce().send();
	}

}
