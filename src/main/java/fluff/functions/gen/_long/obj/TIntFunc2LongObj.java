package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TIntFunc2LongObj<P2, T extends Throwable> {
	
	int invoke(long p1, P2 p2) throws T;
}
