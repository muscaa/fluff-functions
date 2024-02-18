package fluff.functions.gen._int._float._boolean;

@FunctionalInterface
public interface TFunc3IntFloatBoolean<R, T extends Throwable> {
	
	R invoke(int p1, float p2, boolean p3) throws T;
}
