package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Methods {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		Class c = A.class;
		// Field
		Field[] f = c.getDeclaredFields();
		for (int i = 0; i < f.length; i++) {
			f[i].setAccessible(true);
			System.out.println("Field " + (i + 1));
			System.out.println("Name: " + f[i].getName());
			System.out.println("Type: " + f[i].getType().getName());
			System.out.println("Value: " + f[i].get(f[i]));
			System.out.println("Modifier: " + Modifier.toString(f[i].getModifiers()));
			System.out.println("============================================================");
		}

		// Constructor
		Constructor[] cons = c.getDeclaredConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println("Constructor " + (i + 1));
			System.out.println("Name: " + cons[i].getName());
			System.out.println("Modifiers: " + Modifier.toString(cons[i].getModifiers()));
			System.out.print("Parameter types: ");
			Class[] param = cons[i].getParameterTypes();
			for (Class p : param) {
				System.out.print(p.getName() + " ");
			}
			System.out.print("\nExeption types: ");
			Class[] exep = cons[i].getExceptionTypes();
			for (Class e : exep) {
				System.out.print(e.getName() + "\t");
			}
			System.out.println("\n============================================================\n");
		}

		// Method
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println("Method " + (i + 1));
			System.out.println("Name: " + m[i].getName());
			System.out.println("Access modifier: " + Modifier.toString(m[i].getModifiers()));
			System.out.println("Return type: " + m[i].getReturnType().getSimpleName());
			System.out.print("Parameter types: ");
			Class[] param = m[i].getParameterTypes();
			for (Class p : param) {
				System.out.print(p.getSimpleName() + " ");
			}
			System.out.print("\nExeption types: ");
			Class[] exep = m[i].getExceptionTypes();
			for (Class e : exep) {
				System.out.print(e.getName() + "\t");
			}
			System.out.println("\n============================================================\n");
		}
	}

}
