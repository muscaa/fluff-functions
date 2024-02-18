package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface TFunc2<R, P1, P2, T extends Throwable> {
	
	R invoke(P1 p1, P2 p2) throws T;
}
