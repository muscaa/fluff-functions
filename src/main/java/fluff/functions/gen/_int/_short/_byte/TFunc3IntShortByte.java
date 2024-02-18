package fluff.functions.gen._int._short._byte;

@FunctionalInterface
public interface TFunc3IntShortByte<R, T extends Throwable> {
	
	R invoke(int p1, short p2, byte p3) throws T;
}
