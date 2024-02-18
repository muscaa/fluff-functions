package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TFunc2ByteObj<R, P2, T extends Throwable> {
	
	R invoke(byte p1, P2 p2) throws T;
}
