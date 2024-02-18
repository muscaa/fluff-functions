package fluff.functions.gen.obj._byte;

@FunctionalInterface
public interface TFunc2ObjByte<R, P1, T extends Throwable> {
	
	R invoke(P1 p1, byte p2) throws T;
}
