package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface TShortFunc2<P1, P2, T extends Throwable> {
	
	short invoke(P1 p1, P2 p2) throws T;
}
