package fluff.functions.gen._boolean.obj;

@FunctionalInterface
public interface TLongFunc2BooleanObj<P2, T extends Throwable> {
	
	long invoke(boolean p1, P2 p2) throws T;
}
