package fluff.functions.gen._int._float._byte;

@FunctionalInterface
public interface TFunc3IntFloatByte<R, T extends Throwable> {
	
	R invoke(int p1, float p2, byte p3) throws T;
}
