package fluff.functions.gen._int._boolean;

@FunctionalInterface
public interface TFunc2IntBoolean<R, T extends Throwable> {
	
	R invoke(int p1, boolean p2) throws T;
}
