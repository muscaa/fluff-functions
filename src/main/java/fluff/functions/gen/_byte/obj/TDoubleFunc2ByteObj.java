package fluff.functions.gen._byte.obj;

@FunctionalInterface
public interface TDoubleFunc2ByteObj<P2, T extends Throwable> {
	
	double invoke(byte p1, P2 p2) throws T;
}
