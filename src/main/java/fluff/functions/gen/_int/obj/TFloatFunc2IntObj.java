package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TFloatFunc2IntObj<P2, T extends Throwable> {
	
	float invoke(int p1, P2 p2) throws T;
}
