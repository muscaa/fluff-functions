package fluff.functions.gen;

@FunctionalInterface
public interface TShortFunc<T extends Throwable> {
	
	short invoke() throws T;
}
