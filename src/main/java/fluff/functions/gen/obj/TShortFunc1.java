package fluff.functions.gen.obj;

@FunctionalInterface
public interface TShortFunc1<P1, T extends Throwable> {
	
	short invoke(P1 p1) throws T;
}
