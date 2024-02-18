package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TLongFunc2DoubleObj<P2, T extends Throwable> {
	
	long invoke(double p1, P2 p2) throws T;
}
