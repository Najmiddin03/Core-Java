package Annotations;

@classAnnotation(name = "classAnnotation")
public class A {

	@fieldAnnotation(name = "fieldAnnotation")
	public int var = 10;

	@methodAnnotation(name = "methodAnnotation")
	public void m1() {

	}
}
