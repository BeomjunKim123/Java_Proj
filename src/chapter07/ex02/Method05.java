package chapter07.ex02;

class Methodoverloading {
	
	//인풋 매개변수가 없는 메소드
	void print () {
		System.out.println("데이터가 존재하지 않습니다. ");
	}
	
	//인풋 매개변수에 정수 1개를 인풋 받는 메소드
	void pritn (int a) {
		System.out.println("int : " + a);
	}
	
	//인풋 매개변수는 1개 :
	void print(double a) {
		System.out.println("double : " + a);
	}
	
	//인풋 매개변수가 2개
	void print (int a, int b) {
		System.out.println("int a : " + a +  ", int b : " + b);
	}
	
	void print (double a, double b) {
		System.out.println("double a : " + a + ", double b : " + b);
	}
	
	//오류 발생됨 : 인풋 매개변수의 개수, 자료형이 동일한 메소드는 오류가 발생됨, 위에 인트인트가 존재함.
	//void print (int k, int g) {
		
//	}
	
	//메소드 오버 라디잉 : 부모 클래스의 메소드를 재정의 해서 사용함.
		//상속에서 적용
	@Override
	public String toString() {
		
		return "객체 자체를 출력시 object 클래스의 toString() 를 출력 ";
	}
}

public class Method05 {
	
	public static void main(String[] args) {
		/*
		 메소드 오버로딩 : 동일 한 이름의 메소드이지만 시그니처에 따라서 다른 메소드를 식별
		 	- 시그니처 : 메소드를 식별하는 식별자., 인풋 아규먼트 갯수, 인풋 아규먼트의 자료형에 따라서
		 				다른 메소드이것을 식별
		 메소드 오버라이딩 : 상속에서 작동됨. 부모 클래스의 메소드를 자식 클래스에서 재정의 
		 	자바의 모든 클래스는 object 클래스를 상속 받는다.
		 	object 클래스의 필드나, 메소드를 사용할 수 있다.
		 
		 */
		
		Methodoverloading m1 = new Methodoverloading();
		
		//매개변수가 없는 print() 메소드 호출
		m1.print();
		
		//매개변수 1개 : int
		m1.print(10);
		
		//매개변수 1개 : double
		m1.print(50.55);
		
		//매개변수 2개 : 정수
		m1.print(10, 20);
		
		//매개변수 2개 : 실수
		m1.print(77.7, 88.8);
		
		//object 클래스의 메소드 출력
		System.out.println(m1); //객체를 출력 하면
		System.out.println(m1.toString()); //object 클래스의 메소드
		
	}

}
