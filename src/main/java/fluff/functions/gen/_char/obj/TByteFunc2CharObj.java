package fluff.functions.gen._char.obj;

@FunctionalInterface
public interface TByteFunc2CharObj<P2, T extends Throwable> {
	
	byte invoke(char p1, P2 p2) throws T;
}
