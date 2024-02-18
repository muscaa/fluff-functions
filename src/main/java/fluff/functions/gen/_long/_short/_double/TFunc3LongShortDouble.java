package fluff.functions.gen._long._short._double;

@FunctionalInterface
public interface TFunc3LongShortDouble<R, T extends Throwable> {
	
	R invoke(long p1, short p2, double p3) throws T;
}
