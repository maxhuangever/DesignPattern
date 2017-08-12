package com.max.designpattern.factory.abstractfactory;

import com.max.designpattern.factory.basicfactory.Sender;

public interface Provider {
	public Sender produce();
}
