package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TCharFunc2IntObj<P2, T extends Throwable> {
	
	char invoke(int p1, P2 p2) throws T;
}
