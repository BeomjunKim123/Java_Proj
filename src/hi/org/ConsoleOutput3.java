package hi.org;

public class ConsoleOutput3 {
	public static void main(String[] args) {
		// 코드는 main 메소드 내에서 작성
		
		//변수 선언 : Java 와 JavasScript는 완전히 별개의 언어
		// <자료형> <변수명> = <변수에 들어갈 초기값>;
		
		// 문자열 자료형 : String
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName = "홍당무";
		
		//정수형 자료형 : int
		int age = 30;
		//int age2 = 77.7 ; //오류 발생
		
		// 실수형 자료형 : double
		double weith = 70.5 ; //오류 발생, weight
		double weith2 = 50;
		
		// int age = 50; // 오류 발생 age 변수를 새롭게 선언(위에 선언이 되어있음)
		System.out.println(age); //30
		age = 60; // 
		System.out.println(age); //60
		
		System.out.println("======================");
		
		age = 25;
		
		//1. println(); 으로 출력
		System.out.println("=====println()으로 출력======");
		// 우리 아버님 이름은 홍길동 이고, 우리 어머님 이름은 홍길순 입니다.
		// 나의 이름은 홍당무 이고, 나이는 25살이고, 몸무게는 70.5 입니다.
		System.out.println("우리 아버님 이름은 " + fatherName + " 이고, 우리 어머님 이름은 " + motherName + " 입니다." );
		System.out.println("나의 이름은 " + myName + " 이고, 나이는 " + age + "이고, 몸무게는 " + weith + " 입니다." );
		
		
		System.out.println("=====print() 으로 출력=======");
		// 2.print(); 문자열과 변수를 + 연결해서 출력
		System.out.print("우리 아버님 이름은 " + fatherName + " 이고, 우리 어머님 이름은 " + motherName + " 입니다.\n");
		System.out.print("나의 이름은 " + myName + " 이고, 나이는 " + age + "이고, 몸무게는 " + weith + " 입니다.\n");
	
		
		System.out.println("=====printf() 으로 출력=======");
		// 3.printf(); : 문자열내에서 콤마 뒤에 값을 불러드려서 출력
		System.out.printf("우리 아버님 이름은 %s 이고, 우리 어머님 이름은 %s 입니다.\n", fatherName, motherName);
		System.out.printf("나의 이름은 %s 이고, 나이는 %d이고, 몸무게는 %f 입니다.", myName, age, weith);

	}

}
