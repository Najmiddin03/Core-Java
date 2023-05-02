package Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws Exception {
		// Creating Class class
		// First way
		Class c1 = Class.forName("Class.A");
		// Second way
		A a = new A();
		Class c2 = a.getClass();
		// Third way
		Class c3 = A.class;

		// Methods
		System.out.println("Class name      | " + c1.getName());
		System.out.println("Simple name     | " + c1.getSimpleName());
		System.out.println("Access modifiers| " + Modifier.toString(c1.getModifiers()));
		System.out.println("Super class     | " + c1.getSuperclass().getName());
		System.out.print("Interfaces      | ");
		Class[] cls = c1.getInterfaces();
		for (Class c : cls) {
			System.out.print(c.getSimpleName() + " ");
		}
		System.out.print("\nVariables       | ");
		Field[] fields = c1.getDeclaredFields();
		for (Field f : fields) {
			System.out.print(f.getName() + " ");
		}
		System.out.print("\nConstructors    | ");
		Constructor[] cons = c1.getDeclaredConstructors();
		for (Constructor c : cons) {
			System.out.print(c.getName() + " ");
		}
		System.out.print("\nMethods         | ");
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			System.out.print(m.getName() + " ");
		}
	}

}
