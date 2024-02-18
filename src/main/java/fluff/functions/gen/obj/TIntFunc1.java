package fluff.functions.gen.obj;

@FunctionalInterface
public interface TIntFunc1<P1, T extends Throwable> {
	
	int invoke(P1 p1) throws T;
}
