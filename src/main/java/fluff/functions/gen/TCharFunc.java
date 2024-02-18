package fluff.functions.gen;

@FunctionalInterface
public interface TCharFunc<T extends Throwable> {
	
	char invoke() throws T;
}
