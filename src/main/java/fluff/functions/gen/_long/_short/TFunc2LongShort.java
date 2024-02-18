package fluff.functions.gen._long._short;

@FunctionalInterface
public interface TFunc2LongShort<R, T extends Throwable> {
	
	R invoke(long p1, short p2) throws T;
}
