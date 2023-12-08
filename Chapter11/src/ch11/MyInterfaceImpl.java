package ch11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {
	
	@Override
	public T1 method1(T1 t) {
		return t;
	}
	
	@Override
	public T2 method2(T2 t) {
		return t;
	}
}
