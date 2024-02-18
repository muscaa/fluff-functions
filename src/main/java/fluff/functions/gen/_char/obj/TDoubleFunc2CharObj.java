package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TDoubleFunc2CharObj<P2, T extends Throwable> {
	
	double invoke(char p1, P2 p2) throws T;
}
