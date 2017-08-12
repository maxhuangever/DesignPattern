package com.max.designpattern.builder;

/**
 * DESIGN PATTERN 4: Builder pattern Compared with factory pattern, builder
 * pattern creates multiple parts together rather than one instance.
 * 
 * @author 23885_000
 *
 */
public class BuilderTest {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}

}
