package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TLongFunc2ByteObj<P2, T extends Throwable> {
	
	long invoke(byte p1, P2 p2) throws T;
}
