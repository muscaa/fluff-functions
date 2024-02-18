package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TFunc2IntObj<R, P2, T extends Throwable> {
	
	R invoke(int p1, P2 p2) throws T;
}
