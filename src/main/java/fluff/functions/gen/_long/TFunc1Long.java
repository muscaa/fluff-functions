package fluff.functions.gen._long;

@FunctionalInterface
public interface TFunc1Long<R, T extends Throwable> {
	
	R invoke(long p1) throws T;
}
