package fluff.functions.gen._double;

@FunctionalInterface
public interface TFunc1Double<R, T extends Throwable> {
	
	R invoke(double p1) throws T;
}
