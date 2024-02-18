package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TShortFunc2LongObj<P2, T extends Throwable> {
	
	short invoke(long p1, P2 p2) throws T;
}
