package fluff.functions.gen._byte._short._long;

@FunctionalInterface
public interface TFunc3ByteShortLong<R, T extends Throwable> {
	
	R invoke(byte p1, short p2, long p3) throws T;
}
