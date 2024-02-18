package fluff.functions.gen.obj._short;

@FunctionalInterface
public interface TFunc2ObjShort<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, short p2) throws T;
}
