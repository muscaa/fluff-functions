package fluff.functions.gen.obj;

@FunctionalInterface
public interface TByteFunc1<P1, T extends Throwable> {
	
	byte invoke(P1 p1) throws T;
}
