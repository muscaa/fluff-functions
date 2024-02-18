package fluff.functions.gen._long._short._int;

@FunctionalInterface
public interface TFunc3LongShortInt<R, T extends Throwable> {
	
	R invoke(long p1, short p2, int p3) throws T;
}
