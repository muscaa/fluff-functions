package fluff.functions.gen._int._double._boolean;

@FunctionalInterface
public interface TFunc3IntDoubleBoolean<R, T extends Throwable> {
	
	R invoke(int p1, double p2, boolean p3) throws T;
}
