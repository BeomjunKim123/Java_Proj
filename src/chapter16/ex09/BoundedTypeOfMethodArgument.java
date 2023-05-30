package chapter16.ex09;

//테스트할 클래스 생성
class A {}
class B extends A{}
class C extends B{}
class D extends C{}

//상품을 저장하는 제너릭 클래스를 생성 <== 모든 타입의 상품을 저장할 수 있는 클래스
class Goods <T> { //T : 모든 타입이 올수 있다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

//
class Test {
	//일반 메소드 : 메소드 아규먼트로 제너릭 타입의 제한
	void method1 (Goods<A> g) {} //case 1 : A타입만 가능, 주의 : 자식클래스는 적용되지 않음 B, C, D
	void method2 (Goods<?> g) {} //case 2 : ? : 모든 타입이 가능
	void method3 (Goods<? extends B> g) {} //case 3 : B, C, D 타입이 가능함.
	void method4 (Goods<? super B> g) {} //case 4 : A, B
}

public class BoundedTypeOfMethodArgument {

	public static void main(String[] args) {
		/*
			제네릭 클래스도 아니고 제네릭 메소드도 아니지만
			일반메소드의 아규먼트로 들어오는 타입 제한
		 */
		
		//1. Test 객체 생성
		Test t = new Test();
		
		//1. case 1 메소드 호출
		t.method1(new Goods<A>());

	}

}
