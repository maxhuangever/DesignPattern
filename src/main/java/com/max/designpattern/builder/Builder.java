package com.max.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.max.designpattern.factory.basicfactory.MailSender;
import com.max.designpattern.factory.basicfactory.Sender;
import com.max.designpattern.factory.basicfactory.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
}
