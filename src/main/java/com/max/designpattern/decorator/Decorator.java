package com.max.designpattern.decorator;

public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}
	
	public void method() {
		System.out.println("decorator adds something before original method!");
		source.method();
		System.out.println("decorator adds something after original method!");
	}
}
