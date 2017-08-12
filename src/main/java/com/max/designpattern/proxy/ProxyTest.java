package com.max.designpattern.proxy;

/**
 * <p>
 * <b>DESIGN PATTERN 8: Proxy pattern</b> Dynamically add new functions(not new
 * method) for an instance.
 * </p>
 * The difference between <b>Decorator pattern</b> is:<br>
 * <ul>
 * <li>Proxy always hide the source, it focus on control of access to source. It
 * has connection with Source in compile stage.</li>
 * <li>While Decorator always accept source as parameter, it is more
 * dynamically.</li>
 * </ul>
 * 
 * @author 23885_000
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
