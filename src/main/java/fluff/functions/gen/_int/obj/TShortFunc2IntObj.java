package fluff.functions.gen._int.obj;

@FunctionalInterface
public interface TShortFunc2IntObj<P2, T extends Throwable> {
	
	short invoke(int p1, P2 p2) throws T;
}
