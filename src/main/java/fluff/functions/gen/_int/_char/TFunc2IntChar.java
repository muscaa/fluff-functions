package fluff.functions.gen._int._char;

@FunctionalInterface
public interface TFunc2IntChar<R, T extends Throwable> {
	
	R invoke(int p1, char p2) throws T;
}
