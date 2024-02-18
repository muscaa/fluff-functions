package fluff.functions.gen._float.obj;

@FunctionalInterface
public interface TIntFunc2FloatObj<P2, T extends Throwable> {
	
	int invoke(float p1, P2 p2) throws T;
}
