package fluff.functions.gen._short;

@FunctionalInterface
public interface TFunc1Short<R, T extends Throwable> {
	
	R invoke(short p1) throws T;
}
