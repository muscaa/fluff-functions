package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TByteFunc2DoubleObj<P2, T extends Throwable> {
	
	byte invoke(double p1, P2 p2) throws T;
}
