package chapter12.ex01;

abstract class A {
	//인스턴스 필드 : 객체화, Heap
	int a;
	int b;
	
	//일반 메소드
	void print () {
		
	}
	
	//추상 메소드 : { 구현부 (실행) } 가 없는 메소드
	abstract void run(); 
}

class Cat extends A { //콘크리트 클래스, 추상 클래스에서 선언 해놓은 추상 메소드를 구현하는 클래스
	
	@Override
	void run() {
		System.out.println("고양이는 달립니다.");
		// TODO Auto-generated method stub
		
	}
}
class Dog extends A {
	@Override
	void run() {
		System.out.println("개는 달립니다.");
		// TODO Auto-generated method stub
		
	}
}
class Eagle extends A {
	@Override
	void run() {
		System.out.println("독수리는 날라다닙니다.");
		// TODO Auto-generated method stub
		
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		/*
		 	추상 메소드 (Abstract Method)
		 		- 구현부가 존재하지 않는 메소드
		 		- abstract	void abc();
		 		- 추상 메소드가 클래스 블락에 1개 라도 존재하면 반드시 그 클래스는 추상 클래스가 되어야 한다.
		 				abstract class A { }
		 		- 자식 클래스에서 추상 클래스의 추상 메소드를 오버라이딩해서 메소드를 구현 해야 한다.
		 		- 추상 클래스는 객체 생성이 안됨. 자식 클래스를 객체화 해서 타입으로는 적용 할 수 있다.
		 		- 프로젝트를 설계시 메소드이름을 프로그래머가 함부로 바꾸지 못하도록 할 수 있다. (PM 설계)
		 		- 자식 클래스에서 구현하는 메소드를 오버라이딩해서 구현부를 만듦.
		 		- 메소드 이름으 함부로 변경 할 수 없다.
		 		- 유지보수를 쉽게하는 프로그램을 만들때 사용..
		 */
		
		//1. 추상 클래스 (객체화 하지 못한다) : 추상 메소드를 포함하는 클래스
		//A a = new A();

		//2. 추상 클래스는 타입으로 지정이 가능 : 자식을 객체화 해서 부모 타입으로 지정
		A cat1 = new Cat(); //cat1 : A / Cat
		A dog1 = new Dog(); //dog1 : A / Dog
		A eagle1 = new Eagle(); //eagle1 : A / Eagle

		//3. 부모의 추상메소드를 실행하면 오버라이딩되면 자식클래스의 메소드가 출력
		cat1.run();
		dog1.run();
		eagle1.run();
		System.out.println("=============================");

		//4. 배열에 넣고 출력
		A[] arr = new A[] {cat1, dog1, eagle1 };
		
		//5. for 문을 사용해서 배열의 각 방의 내용을 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i].run();
		}
		
		System.out.println("=============================");
		//6. Enhanced for 문을 사용해서 출력
		for (A K : arr) {
			K.run();
		}
	}

}
