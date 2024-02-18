package fluff.functions.gen._char._int._float;

@FunctionalInterface
public interface TFunc3CharIntFloat<R, T extends Throwable> {
	
	R invoke(char p1, int p2, float p3) throws T;
}
