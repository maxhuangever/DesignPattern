package com.max.designpattern.factory.abstractfactory;

import com.max.designpattern.factory.basicfactory.MailSender;
import com.max.designpattern.factory.basicfactory.Sender;

public class MailSenderFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
