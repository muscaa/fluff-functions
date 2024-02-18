package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface TBooleanFunc2<P1, P2, T extends Throwable> {
	
	boolean invoke(P1 p1, P2 p2) throws T;
}
