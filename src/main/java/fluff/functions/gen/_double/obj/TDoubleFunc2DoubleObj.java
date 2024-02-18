package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TDoubleFunc2DoubleObj<P2, T extends Throwable> {
	
	double invoke(double p1, P2 p2) throws T;
}
