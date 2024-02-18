package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface TIntFunc2<P1, P2, T extends Throwable> {
	
	int invoke(P1 p1, P2 p2) throws T;
}
