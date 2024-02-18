package fluff.functions.gen._long._short._byte;

@FunctionalInterface
public interface TFunc3LongShortByte<R, T extends Throwable> {
	
	R invoke(long p1, short p2, byte p3) throws T;
}
