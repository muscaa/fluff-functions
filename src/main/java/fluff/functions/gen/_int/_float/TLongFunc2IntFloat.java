package fluff.functions.gen._int._float;

@FunctionalInterface
public interface TLongFunc2IntFloat<T extends Throwable> {
	
	long invoke(int p1, float p2) throws T;
}
