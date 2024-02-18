package fluff.functions.gen.obj.obj.obj;

@FunctionalInterface
public interface TVoidFunc3<P1, P2, P3, T extends Throwable> {
	
	void invoke(P1 p1, P2 p2, P3 p3) throws T;
}
