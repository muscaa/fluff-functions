package fluff.functions.gen._boolean;

@FunctionalInterface
public interface TFunc1Boolean<R, T extends Throwable> {
	
	R invoke(boolean p1) throws T;
}
