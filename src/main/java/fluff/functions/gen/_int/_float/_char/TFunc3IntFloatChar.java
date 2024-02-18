package fluff.functions.gen._int._float._char;

@FunctionalInterface
public interface TFunc3IntFloatChar<R, T extends Throwable> {
	
	R invoke(int p1, float p2, char p3) throws T;
}
