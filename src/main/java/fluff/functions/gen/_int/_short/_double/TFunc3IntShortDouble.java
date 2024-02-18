package fluff.functions.gen._int._short._double;

@FunctionalInterface
public interface TFunc3IntShortDouble<R, T extends Throwable> {
	
	R invoke(int p1, short p2, double p3) throws T;
}
