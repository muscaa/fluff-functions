package fluff.functions.gen._float.obj;

@FunctionalInterface
public interface TDoubleFunc2FloatObj<P2, T extends Throwable> {
	
	double invoke(float p1, P2 p2) throws T;
}
