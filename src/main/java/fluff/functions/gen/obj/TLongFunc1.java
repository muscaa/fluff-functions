package fluff.functions.gen.obj;

@FunctionalInterface
public interface TLongFunc1<P1, T extends Throwable> {
	
	long invoke(P1 p1) throws T;
}
