package fluff.functions.gen._char._int;

@FunctionalInterface
public interface TFunc2CharInt<R, T extends Throwable> {
	
	R invoke(char p1, int p2) throws T;
}
