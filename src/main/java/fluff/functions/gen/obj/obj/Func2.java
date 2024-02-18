package fluff.functions.gen.obj.obj;

@FunctionalInterface
public interface Func2<R, P1, P2> {
	
	R invoke(P1 p1, P2 p2);
}
