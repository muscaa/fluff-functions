package fluff.functions.gen._int._double;

@FunctionalInterface
public interface TFunc2IntDouble<R, T extends Throwable> {
	
	R invoke(int p1, double p2) throws T;
}
