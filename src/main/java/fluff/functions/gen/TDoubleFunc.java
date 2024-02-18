package fluff.functions.gen;

@FunctionalInterface
public interface TDoubleFunc<T extends Throwable> {
	
	double invoke() throws T;
}
