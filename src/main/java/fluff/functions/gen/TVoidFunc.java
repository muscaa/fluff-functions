package fluff.functions.gen;

@FunctionalInterface
public interface TVoidFunc<T extends Throwable> {
	
	void invoke() throws T;
}
