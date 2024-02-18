package fluff.functions.gen.obj;

@FunctionalInterface
public interface TDoubleFunc1<P1, T extends Throwable> {
	
	double invoke(P1 p1) throws T;
}
