package fluff.functions.gen._long._int;

@FunctionalInterface
public interface TFunc2LongInt<R, T extends Throwable> {
	
	R invoke(long p1, int p2) throws T;
}
