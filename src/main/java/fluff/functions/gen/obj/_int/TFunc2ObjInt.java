package fluff.functions.gen.obj._int;

@FunctionalInterface
public interface TFunc2ObjInt<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, int p2) throws T;
}
