package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TDoubleFunc2IntObj<P2, T extends Throwable> {
	
	double invoke(int p1, P2 p2) throws T;
}
