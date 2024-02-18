package fluff.functions.gen;

@FunctionalInterface
public interface TFunc<R, T extends Throwable> {
	
	R invoke() throws T;
}
