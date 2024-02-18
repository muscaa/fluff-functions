package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TCharFunc2LongObj<P2, T extends Throwable> {
	
	char invoke(long p1, P2 p2) throws T;
}
