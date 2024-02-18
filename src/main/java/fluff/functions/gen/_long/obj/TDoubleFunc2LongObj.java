package fluff.functions.gen._long.obj;

@FunctionalInterface
public interface TDoubleFunc2LongObj<P2, T extends Throwable> {
	
	double invoke(long p1, P2 p2) throws T;
}
