package fluff.functions.gen._int._long._double;

@FunctionalInterface
public interface TFunc3IntLongDouble<R, T extends Throwable> {
	
	R invoke(int p1, long p2, double p3) throws T;
}
