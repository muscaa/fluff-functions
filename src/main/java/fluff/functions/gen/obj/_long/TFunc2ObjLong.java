package fluff.functions.gen.obj._long;

@FunctionalInterface
public interface TFunc2ObjLong<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, long p2) throws T;
}
