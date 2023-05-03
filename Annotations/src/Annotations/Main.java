package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	// @Override
	@Override
	public String toString() {
		return super.toString();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		// @SuppressWarnings(...);
		@SuppressWarnings("unused")
		int i = deprecatedMethod();

		// Class level annotation
		Class c = A.class;
		Annotation ann = c.getAnnotation(classAnnotation.class);
		classAnnotation cann = (classAnnotation) ann;
		System.out.println(cann.name());

		// Method level annotation
		Method m = c.getMethod("m1");
		Annotation ann2 = m.getAnnotation(methodAnnotation.class);
		methodAnnotation mann = (methodAnnotation) ann2;
		System.out.println(mann.name());

		// Field level annotation
		Field f = c.getField("var");
		fieldAnnotation fann = (fieldAnnotation) f.getAnnotation(fieldAnnotation.class);
		System.out.println(fann.name());

		// Repeatable annotation
		B b = new B();
		Class c1 = b.getClass();
		myAnnotation[] anns = (myAnnotation[]) c1.getAnnotationsByType(myAnnotation.class);
		for (myAnnotation x : anns) {
			System.out.println(x.name() + "-->" + x.price());
		}
	}

	// @Deprecated
	@Deprecated
	public static int deprecatedMethod() {
		return 1;
	}

}
