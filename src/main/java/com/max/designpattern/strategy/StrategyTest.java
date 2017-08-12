package com.max.designpattern.strategy;

/**
 * <p>
 * <b>DESIGN PATTERN 13: Strategy pattern</b> <br>
 * Define common method in abstract class rather than utility class, define
 * customized method in concrete class, not in one class(may make this class a
 * big class and not easy to extend or modify. All concrete class implement the
 * same interface.
 * </p>
 * 
 * @author 23885_000
 *
 */
public class StrategyTest {
	public static void main(String[] args) {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
