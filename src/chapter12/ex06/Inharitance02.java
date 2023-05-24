package chapter12.ex06;

interface Animal1 {
	void cry();
}
interface Animal2 {
	void run();
}
interface Animal3 {
	void eat();
}

//인터페이스가 인터페이스를 상속 할 수 있따. extends 키를 사용한다.
	//클래스가 클래스를 상속 할때, extends
interface K extends Animal1, Animal2, Animal3 {
	//cry(), run(), eat() 

}
class G implements K {

	@Override
	public void cry() {
		System.out.println("모든 동물은 웁니다.");
		
	}

	@Override
	public void run() {
		System.out.println("모든 동물은 달립니다.");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class Inharitance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		K k1 = new G();
		k1.cry();
		k1.eat();
		k1.run();
		
		Animal1 a1 = new G();
		a1.cry();
		
		Animal2 a2 = new G();
		a2.run();
		
		Animal3 a3 = new G();
		a3.eat();

	}

}
