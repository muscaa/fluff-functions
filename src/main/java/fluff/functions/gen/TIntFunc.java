package fluff.functions.gen;

@FunctionalInterface
public interface TIntFunc<T extends Throwable> {
	
	int invoke() throws T;
}
