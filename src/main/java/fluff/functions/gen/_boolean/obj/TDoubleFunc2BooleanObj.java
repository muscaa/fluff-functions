package fluff.functions.gen._boolean.obj;

@FunctionalInterface
public interface TDoubleFunc2BooleanObj<P2, T extends Throwable> {
	
	double invoke(boolean p1, P2 p2) throws T;
}
