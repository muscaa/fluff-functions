package fluff.functions.gen.obj._boolean;

@FunctionalInterface
public interface TFunc2ObjBoolean<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, boolean p2) throws T;
}
