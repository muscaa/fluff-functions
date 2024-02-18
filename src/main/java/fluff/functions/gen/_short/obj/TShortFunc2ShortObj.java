package fluff.functions.gen._short.obj;

@FunctionalInterface
public interface TShortFunc2ShortObj<P2, T extends Throwable> {
	
	short invoke(short p1, P2 p2) throws T;
}
