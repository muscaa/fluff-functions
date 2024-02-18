package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TIntFunc2CharObj<P2, T extends Throwable> {
	
	int invoke(char p1, P2 p2) throws T;
}
