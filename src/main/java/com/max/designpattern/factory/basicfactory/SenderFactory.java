package com.max.designpattern.factory.basicfactory;

public class SenderFactory {
	// common factory
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("wrong type");
			return null;
		}
	}
	
	// another factory
	public Sender produceMailSender(){
		return new MailSender();
	}
	public Sender produceSmsSender(){
		return new SmsSender();
	}
}
