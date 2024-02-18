package fluff.functions.gen._char._byte;

@FunctionalInterface
public interface TFunc2CharByte<R, T extends Throwable> {
	
	R invoke(char p1, byte p2) throws T;
}
