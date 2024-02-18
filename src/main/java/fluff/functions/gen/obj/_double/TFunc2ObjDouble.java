package fluff.functions.gen.obj._double;

@FunctionalInterface
public interface TFunc2ObjDouble<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, double p2) throws T;
}
