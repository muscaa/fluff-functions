package fluff.functions.gen._long._short._float;

@FunctionalInterface
public interface TFunc3LongShortFloat<R, T extends Throwable> {
	
	R invoke(long p1, short p2, float p3) throws T;
}
