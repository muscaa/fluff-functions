package fluff.functions.gen;

@FunctionalInterface
public interface TLongFunc<T extends Throwable> {
	
	long invoke() throws T;
}
