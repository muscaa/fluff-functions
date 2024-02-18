package fluff.functions.gen._float._int._double;

@FunctionalInterface
public interface TFunc3FloatIntDouble<R, T extends Throwable> {
	
	R invoke(float p1, int p2, double p3) throws T;
}
