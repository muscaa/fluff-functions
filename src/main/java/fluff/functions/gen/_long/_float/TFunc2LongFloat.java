package fluff.functions.gen._long._float;

@FunctionalInterface
public interface TFunc2LongFloat<R, T extends Throwable> {
	
	R invoke(long p1, float p2) throws T;
}
