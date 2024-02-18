package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TIntFunc2DoubleObj<P2, T extends Throwable> {
	
	int invoke(double p1, P2 p2) throws T;
}
