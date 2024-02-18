package fluff.functions.gen._float.obj;

@FunctionalInterface
public interface TLongFunc2FloatObj<P2, T extends Throwable> {
	
	long invoke(float p1, P2 p2) throws T;
}
