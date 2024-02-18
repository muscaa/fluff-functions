package fluff.functions.gen._float._double;

@FunctionalInterface
public interface TFunc2FloatDouble<R, T extends Throwable> {
	
	R invoke(float p1, double p2) throws T;
}
