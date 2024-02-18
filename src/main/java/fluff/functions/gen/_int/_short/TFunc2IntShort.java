package fluff.functions.gen._int._short;

@FunctionalInterface
public interface TFunc2IntShort<R, T extends Throwable> {
	
	R invoke(int p1, short p2) throws T;
}
