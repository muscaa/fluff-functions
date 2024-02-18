package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TFunc2LongObj<R, P2, T extends Throwable> {
	
	R invoke(long p1, P2 p2) throws T;
}
