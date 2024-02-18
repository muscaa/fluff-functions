package fluff.functions.gen.obj._float;

@FunctionalInterface
public interface TFunc2ObjFloat<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, float p2) throws T;
}
