package fluff.functions.gen._int._long;

@FunctionalInterface
public interface TFunc2IntLong<R, T extends Throwable> {
	
	R invoke(int p1, long p2) throws T;
}
