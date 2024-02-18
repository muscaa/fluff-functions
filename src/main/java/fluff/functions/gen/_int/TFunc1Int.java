package fluff.functions.gen._int;

@FunctionalInterface
public interface TFunc1Int<R, T extends Throwable> {
	
	R invoke(int p1) throws T;
}
