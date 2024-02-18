package fluff.functions.gen._int._double._long;

@FunctionalInterface
public interface TFunc3IntDoubleLong<R, T extends Throwable> {
	
	R invoke(int p1, double p2, long p3) throws T;
}
