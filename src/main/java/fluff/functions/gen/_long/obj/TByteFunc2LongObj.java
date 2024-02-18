package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TByteFunc2LongObj<P2, T extends Throwable> {
	
	byte invoke(long p1, P2 p2) throws T;
}
