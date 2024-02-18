package fluff.functions.gen._short.obj;

@FunctionalInterface
public interface TFunc2ShortObj<R, P2, T extends Throwable> {
	
	R invoke(short p1, P2 p2) throws T;
}
