package fluff.functions.gen;

@FunctionalInterface
public interface TByteFunc<T extends Throwable> {
	
	byte invoke() throws T;
}
