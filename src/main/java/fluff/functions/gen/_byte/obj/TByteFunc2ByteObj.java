package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TByteFunc2ByteObj<P2, T extends Throwable> {
	
	byte invoke(byte p1, P2 p2) throws T;
}
