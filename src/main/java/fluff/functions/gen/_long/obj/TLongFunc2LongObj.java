package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TLongFunc2LongObj<P2, T extends Throwable> {
	
	long invoke(long p1, P2 p2) throws T;
}
