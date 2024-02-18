package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TCharFunc2ByteObj<P2, T extends Throwable> {
	
	char invoke(byte p1, P2 p2) throws T;
}
