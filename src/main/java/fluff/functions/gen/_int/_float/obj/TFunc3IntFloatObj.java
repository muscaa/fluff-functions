package fluff.functions.gen._int._float.obj;

@FunctionalInterface
public interface TFunc3IntFloatObj<R, P3, T extends Throwable> {
	
	R invoke(int p1, float p2, P3 p3) throws T;
}
