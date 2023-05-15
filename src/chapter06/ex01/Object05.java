package chapter06.ex01;

class Animal{
	//기본 생성자 외부 클래스
	public Animal() {}
	
	//필드
	String animalName;
	String animalCry;
	String animalRun;
	int animalAge;
	double animalWeight;
	
	// 필드의 내용을 출력 : 필드의 내용출력
	public void print() {
	System.out.println("동물이름 : " + animalName);
	System.out.println("동물의 울음소리 : " + animalCry);
	System.out.println("동물의 운동 : " + animalRun);
	System.out.println("동물 나이 : " + animalAge);
	System.out.println("동물 몸무게 : " + animalWeight);
	}
}


public class Object05 {
	public static void main(String[] args) {
		//Animal 클래스 ==> tiger 객체 생성 : "호랑이"/"어흥"/"컹충컹충"/10/300
		//Animal 클래스 ==> eagle 객체 생성 : "독수리"/"키이오"/"훨훨날아감"/20/30
		//Animal 클래스 ==> dog 객체 생성 : "강아지"/"멍멍"/"팔짝팔짝"/40/20
		
		//arr1 배열에 객체를 저장후 
		
		//1. tiger 객체 생성
		Animal tiger = new Animal();
		
		//객체를 생성하면, 객체의 필드와 메소드를 사용.
		//2. 객체의 필드의 값을 넣는다.
		tiger.animalName = "호랑이";
		tiger.animalCry = "어흥";
		tiger.animalRun = "컹충컹충";
		tiger.animalAge = 10;
		tiger.animalWeight = 300;
		
		//3.print() : 필드의 값을 출력
		tiger.print();
		
		System.out.println("==================================");
		Animal eagle = new Animal();
		
		eagle.animalName = "독수리";
		eagle.animalCry = "키이오";
		eagle.animalRun = "훨훨날아감";
		eagle.animalAge = 20;
		eagle.animalWeight = 30;
		
		eagle.print();
		
		System.out.println("==================================");
		Animal dog = new Animal();
		
		dog.animalName = "강아지";
		dog.animalCry = "멍멍";
		dog.animalRun = "팔짝팔짝";
		dog.animalAge = 40;
		dog.animalWeight = 20;
		
		dog.print();
		
		
		System.out.println("==================================");
		System.out.println("=====객체를 배열에 저장============");
		
		int[] arr11 = new int[3]; //arr1 배열은 방(index) 3개가 생성이되고 정수만 입력
		double[] arr12 = new double[3]; //arr2 배열은 방(index) 3개가 생성되고 실수만 입력
		String[] arr13 = new String[3]; //문자열만 지정가능
		
		Animal[] arr1 = new Animal[3]; //Animal 타입의 객체만 저장이 가능
		
		//각 배열의 방에 Animall 타입의 객체를 저장, tiger, eagle dog는 
		//animal 클래스로 생성됨, Animal 타입을 가지고 있다.
		
		arr1[0] = tiger; //arr1 0번째 방에 tiger 객체를 저장
		arr1[1] = eagle; //arr1 1번째 방에 eagle 객체를 저장
		arr1[2] = dog; //arr1 2번째 방에 dog 객체를 저장
		
		/*
		Animal out1 = arr1[0]; 
		Animal out2 = arr1[1]; 
		Animal out3 = arr1[2]; 
		*/
		
		//각 배열의 방에는 객체의 Heap의 주소가 들어가 있다.
		System.out.println(tiger); //72ccd017
		System.out.println(eagle); //182decdb
		System.out.println(dog); //26f0a63f
		
		//배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어낸다.
		//객체 변수를 선언후 끄집어낸다.
		
		/*
		out1.print();
		System.out.println("==================================");
		out2.print();
		System.out.println("==================================");
		out3.print();
		*/
	
		System.out.println("==================================");
		Animal a1 = null;	//객체형 변수 : a1
			System.out.println(a1);
		a1 = arr1[0];	// arr1[0] 방의 값을 가지고 와서 a1 변수에 할당
			System.out.println(a1);
			
		Animal a2 = arr1[1]; //eagle 객체
		Animal a3 = arr1[2]; //dog 객체
		
		System.out.println("==================================");
		a1.print(); //tiger 객체의 정보를 출력
	}

}
