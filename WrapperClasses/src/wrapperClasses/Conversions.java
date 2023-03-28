package wrapperClasses;

public class Conversions {

	public static void main(String[] args) {
		// Primitive to object
		int i = 10;
		// 1)
		Integer obj = new Integer(i);
		// 2)
		obj = Integer.valueOf(i);
		// 3)
		obj = i;

		// Object to primitive
		obj = new Integer(10);
		// 1)
		i = obj.intValue();
		// 2)
		i = obj;

		// String to object
		String str = "10";
		// 1)
		obj = new Integer(str);
		// 2)
		obj = Integer.valueOf(str);

		// Object to String
		// 1)
		str = obj.toString();
		// 2)
		str = "" + obj;

		// String to primitive
		// 1)
		i = Integer.parseInt(str);

		// Primitive to String
		// 1)
		str = Integer.toString(i);
		// 2)
		str = "" + i;

	}

}
