package fluff.functions.gen._double.obj;

@FunctionalInterface
public interface TCharFunc2DoubleObj<P2, T extends Throwable> {
	
	char invoke(double p1, P2 p2) throws T;
}
