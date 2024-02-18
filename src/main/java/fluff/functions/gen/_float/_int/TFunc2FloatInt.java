package fluff.functions.gen._float._int;

@FunctionalInterface
public interface TFunc2FloatInt<R, T extends Throwable> {
	
	R invoke(float p1, int p2) throws T;
}
