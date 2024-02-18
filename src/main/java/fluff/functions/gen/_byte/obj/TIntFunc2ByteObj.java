package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TIntFunc2ByteObj<P2, T extends Throwable> {
	
	int invoke(byte p1, P2 p2) throws T;
}
