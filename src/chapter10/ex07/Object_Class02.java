//package chapter10.ex07;
//
//class Aa { //extends Object
//
//	//필드
//	String name;
//	
//	Aa(String name){
//		this.name = name;
//	}
//	
//	Object c;
//	
//	
//}
//
//class Bb { //extends Object
//	//Object 클래스의 equals()를 재정의 해서 Heap의 값을 비교하도로고 재저의
//	
//	String name;
//	
//	Bb (String name){
//		this.name = name;
//	}
//	
//	//Object의 메소드를 재정의 : Heap영역의 값을 비교하도록 재정의
//	
////	public boolean equals(Object obj) {
////		if (this.name == ((Bb)obj).name) {
////			return true;
////		}
////	}
////	
////}
//
//public class Object_Class02 {
//	
//	public static void main(String[] args) {
//		/*
//		 	Object 클래스의 equals() 메소드 : 기본적으로 == stack의 주소를 비교 하도록 설정
//		 		equals() 메소드는 Heap의 값을 비교하는 것이 아니라 Stack 메모리의 참조 주소를 비교 하도록 셋팅
//		 		//그래서 equals() 메소드를 Heap의 값을 비교 할 수 있도록 재정의 해서 사용해야함.
//		 	
//		 	아주 특수하게 String 클래스는 equals() 메소드가 Heap의 값을 비교하도록 재정의가 되어 있다.
//		 	
//		 */
//		
//		//Aa 객체 생성
//		
//		Aa a1 = new Aa("안녕");
//		Aa a2 = new Aa("안녕");
//		
//		System.out.println("Stack의 주소 : " + a1);
//		System.out.println("Stack의 주소 : " + a2);
//		
//		System.out.println(a1 == a2);  //false  //Stack에 저장된 Heap의 주소를 비교함
//		System.out.println(a1.equals(a2)); //false
//		
//		System.out.println("======================");
//		String s1 = new String("안녕");
//		String s2 = new String("안녕");
//		
//		System.out.println(s1 == s2); //false
//		System.out.println(s1.equals(s2)); //true //Object클래스의 equals를 재정의 해서 Heap의 값을 비교하도록 정의
//	
//		System.out.println("======================");
//		Bb b1 = new Bb("안녕");
//		Bb b2 = new Bb("안녕");
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		
//		System.out.println(b1 == b2);  //false  //Stack에 저장된 Heap의 주소를 비교함
//		System.out.println(b1.equals(b2));
//	
//	}
//
//}
//}
