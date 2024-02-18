package fluff.functions.gen._boolean.obj;

@FunctionalInterface
public interface TIntFunc2BooleanObj<P2, T extends Throwable> {
	
	int invoke(boolean p1, P2 p2) throws T;
}
