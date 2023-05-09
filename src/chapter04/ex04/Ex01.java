package chapter04.ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		   1000 부터 1까지 5씩 감소하면서 출력 : for, while
		 */
		
		System.out.println("=====1. for문으로 출력 =====");
		for (int i = 1000; i > 1 ; i-=5) {
			System.out.println(i + "\t");
		}
		System.out.println("\n\n");
		
		System.out.println("=====2. while문으로 출력 =====");
		int a = 1000; //초기값 : while 밖에서 선언
		while (a > 1) { //조건
			System.out.println(a + "t"); //조건이 true일동안 실행
			a-=5; //증감식
		}
		
	}

}
