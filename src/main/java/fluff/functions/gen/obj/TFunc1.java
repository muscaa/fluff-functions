package fluff.functions.gen.obj;

@FunctionalInterface
public interface TFunc1<R, P1, T extends Throwable> {
	
	R invoke(P1 p1) throws T;
}
