package fluff.functions.gen.obj.obj.obj;

@FunctionalInterface
public interface TIntFunc3<P1, P2, P3, T extends Throwable> {
	
	int invoke(P1 p1, P2 p2, P3 p3) throws T;
}
