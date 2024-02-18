package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TFunc2CharObj<R, P2, T extends Throwable> {
	
	R invoke(char p1, P2 p2) throws T;
}
