package fluff.functions.gen._int._byte;

@FunctionalInterface
public interface TFunc2IntByte<R, T extends Throwable> {
	
	R invoke(int p1, byte p2) throws T;
}
