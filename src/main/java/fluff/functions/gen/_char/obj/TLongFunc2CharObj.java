package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TLongFunc2CharObj<P2, T extends Throwable> {
	
	long invoke(char p1, P2 p2) throws T;
}
