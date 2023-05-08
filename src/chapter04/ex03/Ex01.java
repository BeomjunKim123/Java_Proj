package chapter04.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 스캐너로 1단 ~ 9까지의 정수를 인풋 받아서 for 문을 사용해서
		 인풋 받은 단수를 출력
		 1. println () 으로 출력
		 2. printf () 으로 출력
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("수를 입력하세요>>");
		a = sc.nextInt();
		
		System.out.println();
		System.out.println("=====2단을 println()으로 출력=====================");
		for (b = 1; b < 10; b++);
			System.out.println(a +" * " + b + "=" + a*b);
	
		System.out.println("=====2단을 printf()으로 출력=====================");
		
	}

}
