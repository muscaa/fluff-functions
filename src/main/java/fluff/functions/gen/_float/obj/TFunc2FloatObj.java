package fluff.functions.gen._float.obj;

@FunctionalInterface
public interface TFunc2FloatObj<R, P2, T extends Throwable> {
	
	R invoke(float p1, P2 p2) throws T;
}
