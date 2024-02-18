package fluff.functions.gen._short.obj;

@FunctionalInterface
public interface TLongFunc2ShortObj<P2, T extends Throwable> {
	
	long invoke(short p1, P2 p2) throws T;
}
