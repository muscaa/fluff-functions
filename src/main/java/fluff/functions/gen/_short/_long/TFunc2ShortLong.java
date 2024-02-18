package fluff.functions.gen._short._long;

@FunctionalInterface
public interface TFunc2ShortLong<R, T extends Throwable> {
	
	R invoke(short p1, long p2) throws T;
}
