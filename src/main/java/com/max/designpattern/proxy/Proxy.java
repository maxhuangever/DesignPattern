package com.max.designpattern.proxy;

public class Proxy implements Sourceable {
	private Source source;
	public Proxy() {
		super();
		this.source = new Source();
	}

	public void method() {
		before();
		source.method();
		atfer();
	}
	
	private void atfer() {
		System.out.println("proxy add something after!");
	}
	
	private void before() {
		System.out.println("proxy add something before!");
	}
}
