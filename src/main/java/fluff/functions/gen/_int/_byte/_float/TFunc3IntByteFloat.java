package fluff.functions.gen._int._byte._float;

@FunctionalInterface
public interface TFunc3IntByteFloat<R, T extends Throwable> {
	
	R invoke(int p1, byte p2, float p3) throws T;
}
