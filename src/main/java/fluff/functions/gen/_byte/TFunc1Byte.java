package fluff.functions.gen._byte;

@FunctionalInterface
public interface TFunc1Byte<R, T extends Throwable> {
	
	R invoke(byte p1) throws T;
}
