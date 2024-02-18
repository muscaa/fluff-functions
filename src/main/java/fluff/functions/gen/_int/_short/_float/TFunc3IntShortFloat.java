package fluff.functions.gen._int._short._float;

@FunctionalInterface
public interface TFunc3IntShortFloat<R, T extends Throwable> {
	
	R invoke(int p1, short p2, float p3) throws T;
}
