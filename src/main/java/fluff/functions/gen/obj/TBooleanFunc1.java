package fluff.functions.gen.obj;

@FunctionalInterface
public interface TBooleanFunc1<P1, T extends Throwable> {
	
	boolean invoke(P1 p1) throws T;
}
