package fluff.functions.gen._int._short._long;

@FunctionalInterface
public interface TFunc3IntShortLong<R, T extends Throwable> {
	
	R invoke(int p1, short p2, long p3) throws T;
}
