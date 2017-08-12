package com.max.designpattern.flyweight;

/**
 * <p>
 * <b>DESIGN PATTERN 12: Flyweight pattern</b> <br>
 * If a same object is used frequently, then use memory to save them.
 * </p>
 * @author 23885_000
 *
 */
public class FlyweightTest {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;

	public FlyweightTest() {
		fly1 = factory.getFlyWeight("Google");
		fly2 = factory.getFlyWeight("Qutr");
		fly3 = factory.getFlyWeight("Google");
		fly4 = factory.getFlyWeight("Google");
		fly5 = factory.getFlyWeight("Google");
		fly6 = factory.getFlyWeight("Google");
	}
	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}
	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		FlyweightTest fp = new FlyweightTest();
		fp.showFlyweight();
	}
}
