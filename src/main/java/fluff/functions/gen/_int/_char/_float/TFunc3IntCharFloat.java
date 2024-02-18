package fluff.functions.gen._int._char._float;

@FunctionalInterface
public interface TFunc3IntCharFloat<R, T extends Throwable> {
	
	R invoke(int p1, char p2, float p3) throws T;
}
