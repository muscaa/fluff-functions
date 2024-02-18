package fluff.functions.gen._int._float._double;

@FunctionalInterface
public interface TFunc3IntFloatDouble<R, T extends Throwable> {
	
	R invoke(int p1, float p2, double p3) throws T;
}
