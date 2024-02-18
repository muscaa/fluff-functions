package fluff.functions.gen._float;

@FunctionalInterface
public interface TFunc1Float<R, T extends Throwable> {
	
	R invoke(float p1) throws T;
}
