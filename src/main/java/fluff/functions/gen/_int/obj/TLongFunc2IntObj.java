package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TLongFunc2IntObj<P2, T extends Throwable> {
	
	long invoke(int p1, P2 p2) throws T;
}
