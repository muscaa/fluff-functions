package fluff.functions.gen._int._float;

@FunctionalInterface
public interface TFunc2IntFloat<R, T extends Throwable> {
	
	R invoke(int p1, float p2) throws T;
}
