package fluff.functions.gen._int._float._long;

@FunctionalInterface
public interface TFunc3IntFloatLong<R, T extends Throwable> {
	
	R invoke(int p1, float p2, long p3) throws T;
}
