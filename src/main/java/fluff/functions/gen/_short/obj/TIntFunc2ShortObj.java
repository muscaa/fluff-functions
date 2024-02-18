package fluff.functions.gen._short.obj;

@FunctionalInterface
public interface TIntFunc2ShortObj<P2, T extends Throwable> {
	
	int invoke(short p1, P2 p2) throws T;
}
