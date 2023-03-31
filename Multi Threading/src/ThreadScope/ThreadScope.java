package ThreadScope;

public class ThreadScope extends ThreadLocal<String> {
	@Override
	protected String initialValue() {
		return "Data isn't defined in this scope";
	}
}
