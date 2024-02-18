package fluff.functions.gen;

@FunctionalInterface
public interface TFloatFunc<T extends Throwable> {
	
	float invoke() throws T;
}
