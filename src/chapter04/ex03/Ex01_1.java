package chapter04.ex03;

import java.util.Scanner;

public class Ex01_1 {
	public static void main(String[] args) {
		/*
		 스캐너로 1단 ~ 9까지의 정수를 인풋 받아서 for 문을 사용해서
		 인풋 받은 단수를 출력
		 1. println () 으로 출력
		 2. printf () 으로 출력
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		// 사용할 변수 선언 : i(단), j
		int i, j;
		System.out.println("출력할 단수(1단 ~ 9단) 정수를 입락하세요>>>");
		i = sc.nextInt(); //콘솔로 부터 단수를 입력 받아 i 변수에 값 할당.
		
		System.out.println("========println() 으로 출력");
		for (j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = "+ i*j);
		} //i는 인풋받을 값이고 j는 1씩 증가해서 보여주는
		
		System.out.println("========printf() 으로 출력");
		for (j=1; j<10; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i*j);
		}
		
		sc.close();
	}

}
