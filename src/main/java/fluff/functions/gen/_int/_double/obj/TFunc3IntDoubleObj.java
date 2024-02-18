package fluff.functions.gen._int._double.obj;

@FunctionalInterface
public interface TFunc3IntDoubleObj<R, P3, T extends Throwable> {
	
	R invoke(int p1, double p2, P3 p3) throws T;
}
