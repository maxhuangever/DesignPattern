package com.max.designpattern.factory.basicfactory;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("send by sms");
	}

}
