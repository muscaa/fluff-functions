package fluff.functions.gen.obj._char;

@FunctionalInterface
public interface TFunc2ObjChar<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, char p2) throws T;
}
