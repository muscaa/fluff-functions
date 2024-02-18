package fluff.functions.gen._boolean.obj;

@FunctionalInterface
public interface TFunc2BooleanObj<R, P2, T extends Throwable> {
	
	R invoke(boolean p1, P2 p2) throws T;
}
