package com.max.designpattern.factory.basicfactory;

public class MailSender implements Sender {

	public void send() {
		System.out.println("send by mail");
	}

}
