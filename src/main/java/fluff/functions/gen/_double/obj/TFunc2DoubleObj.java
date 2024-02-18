package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TFunc2DoubleObj<R, P2, T extends Throwable> {
	
	R invoke(double p1, P2 p2) throws T;
}
