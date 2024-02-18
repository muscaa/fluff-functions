package fluff.functions.gen._float.obj;

@FunctionalInterface
public interface TFloatFunc2FloatObj<P2, T extends Throwable> {
	
	float invoke(float p1, P2 p2) throws T;
}
