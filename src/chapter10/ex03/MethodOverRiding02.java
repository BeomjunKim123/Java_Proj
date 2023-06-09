package chapter10.ex03;

class Animal {
	
	void Cry() {
		System.out.println("모든 동물은 웁니다. ");
	}
}
class Tiger extends Animal {
	
	@Override
	void Cry() {
		// TODO Auto-generated method stub
		System.out.println("어흥");
	}
}
class Eagle extends Animal{
	@Override
	void Cry() {
		// TODO Auto-generated method stub
		System.out.println("끼이오");
	}
}
class Lion extends Animal{
	@Override
	void Cry() {
		// TODO Auto-generated method stub
		System.out.println("크아아");
	}
}
	
public class MethodOverRiding02 {
	public static void main(String[] args) {
		
		//1. Animal을 Animal 타입으로 객체화
		Animal a1 = new Animal();
		a1.Cry(); //Animal 클래스의 cry를 호출됨
		
		//2.자식을 객체화 하면서 부모타입으로 선언 : 오버라이딩된 메소드가 출력됨.
		Animal a2 = new Tiger();
		a2.Cry();  //a2.cry() <== Animal의 메소드 호출, 오버라이딩된 메소드
		
		Animal a3 = new Eagle();
		a3.Cry();
		
		Animal a4 = new Lion();
		a4.Cry();
		
	}
}
