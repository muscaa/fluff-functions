package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TIntFunc2IntObj<P2, T extends Throwable> {
	
	int invoke(int p1, P2 p2) throws T;
}
