package com.max.designpattern.factory.abstractfactory;

import com.max.designpattern.factory.basicfactory.Sender;
import com.max.designpattern.factory.basicfactory.SmsSender;

public class SmsSenderFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
