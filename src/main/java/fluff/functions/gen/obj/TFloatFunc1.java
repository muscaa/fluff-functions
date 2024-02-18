package fluff.functions.gen.obj;

@FunctionalInterface
public interface TFloatFunc1<P1, T extends Throwable> {
	
	float invoke(P1 p1) throws T;
}
