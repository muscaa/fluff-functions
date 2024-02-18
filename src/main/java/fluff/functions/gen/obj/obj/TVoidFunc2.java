package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface TVoidFunc2<P1, P2, T extends Throwable> {
	
	void invoke(P1 p1, P2 p2) throws T;
}
