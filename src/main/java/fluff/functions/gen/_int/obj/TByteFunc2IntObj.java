package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TByteFunc2IntObj<P2, T extends Throwable> {
	
	byte invoke(int p1, P2 p2) throws T;
}
