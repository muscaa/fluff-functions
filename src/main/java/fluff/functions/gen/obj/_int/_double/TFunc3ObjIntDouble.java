package fluff.functions.gen.obj._int._double;

@FunctionalInterface
public interface TFunc3ObjIntDouble<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, int p2, double p3) throws T;
}
