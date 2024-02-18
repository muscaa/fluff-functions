package fluff.functions.gen;

@FunctionalInterface
public interface TBooleanFunc<T extends Throwable> {
	
	boolean invoke() throws T;
}
