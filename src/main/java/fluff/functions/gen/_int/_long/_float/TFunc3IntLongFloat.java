package fluff.functions.gen._int._long._float;

@FunctionalInterface
public interface TFunc3IntLongFloat<R, T extends Throwable> {
	
	R invoke(int p1, long p2, float p3) throws T;
}
