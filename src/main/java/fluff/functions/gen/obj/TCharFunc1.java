package fluff.functions.gen.obj;

@FunctionalInterface
public interface TCharFunc1<P1, T extends Throwable> {
	
	char invoke(P1 p1) throws T;
}
