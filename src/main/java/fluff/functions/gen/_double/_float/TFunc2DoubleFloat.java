package fluff.functions.gen._double._float;

@FunctionalInterface
public interface TFunc2DoubleFloat<R, T extends Throwable> {
	
	R invoke(double p1, float p2) throws T;
}
