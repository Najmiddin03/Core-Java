package Class;

import java.io.Serializable;

@SuppressWarnings("serial")
public class A implements Serializable, Cloneable {
	private static String var1 = "Hello";
	protected static String var2 = "World";
	public static int count = 10;

	protected A(float f) throws ExceptionInInitializerError, ArrayIndexOutOfBoundsException {

	}

	public A(String str, int i) throws ClassCastException, IllegalArgumentException {

	}

	public String getVar1(long l) throws ExceptionInInitializerError {
		return var1;
	}

	@SuppressWarnings("static-access")
	public void setVar1(String var1) throws ArrayIndexOutOfBoundsException {
		this.var1 = var1;
	}

	public String getVar2(float f) throws IllegalArgumentException, Exception {
		return var2;
	}

	@SuppressWarnings("static-access")
	public void setVar2(String var2) throws Exception {
		this.var2 = var2;
	}

}
