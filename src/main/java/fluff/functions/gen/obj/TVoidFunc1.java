package fluff.functions.gen.obj;

@FunctionalInterface
public interface TVoidFunc1<P1, T extends Throwable> {
	
	void invoke(P1 p1) throws T;
}
