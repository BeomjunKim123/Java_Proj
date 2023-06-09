package chapter05.ex07;

public class Main_Method_Argument {
	public static void main(String[] args) {
		/*
		  Method(메소드) : C에서 함수를 객체 지향 언어(OOP)에서 메소드라 호칭 
		  	- 접근지정자 반환타입 메솓명 (인풋매개변수) {
		  		실행블락
		  	}
		 */
		
		//클래스를 실행하면서 argument에 저장한값을 args에 값을 던져주게됨
		
		//1. args : main 메소드로 String[] 담는 배열의 변수
		
		
		//main 메소드 Input으로 값을 넘겨서 변수에 할당하고 출력
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		System.out.println(a + b + c + d); // + :는 연결 연산자로 사용됨
		//argument : 메인메소드 변수로 값을 던지겠다.
		
		System.out.println("=======================");
		// String을 정수로 변환 : Integer.perseInt(); //숫자형으로 들어가기위해서는 
		
		int aa = Integer.parseInt(args[0]); //10
		int bb = Integer.parseInt(args[1]); //20
		int cc = Integer.parseInt(args[2]); //30
		int dd = Integer.parseInt(args[3]); //40
		
		System.out.println(aa + bb + cc + dd); //+ 는 더하기 연산자로 사용됨
		
		System.out.println("=======================");
		// main 메소드의 매개 변수 args로 들어오는 값을 For 문을 사용해서 출력
		System.err.println(args.length); //배열에 넘어오는 개수
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
