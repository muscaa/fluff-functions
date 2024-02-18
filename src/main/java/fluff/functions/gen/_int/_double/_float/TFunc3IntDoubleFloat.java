package fluff.functions.gen._int._double._float;

@FunctionalInterface
public interface TFunc3IntDoubleFloat<R, T extends Throwable> {
	
	R invoke(int p1, double p2, float p3) throws T;
}
