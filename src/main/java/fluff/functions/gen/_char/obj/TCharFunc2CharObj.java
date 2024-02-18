package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TCharFunc2CharObj<P2, T extends Throwable> {
	
	char invoke(char p1, P2 p2) throws T;
}
