package fluff.functions.gen._long._double;

@FunctionalInterface
public interface TFunc2LongDouble<R, T extends Throwable> {
	
	R invoke(long p1, double p2) throws T;
}
