package chapter03.ex06;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		/*
		  Ex01> 삼항 연산자를 사용해서 스캐너로 정수값을 인풋 받아서 인풋 받은 값이 홀수이면
		  	" 지금 넣은 값은 0 이고 [홀수/짝수] 입니다."
		  	
		  Ex02> 스캐너로 인풋 받은 값이 3,6,9의 배수이면 "3, 6, 9의 배수 입니다"
		  "지금 넣은 값은 3, 6, 9의 배수 입니다"
		  "지금 넣은 값은 3,6,9의 배수가 아닙니다."
		 */
		
		//ex01
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력 : ");
		int num = sc.nextInt();
		System.out.println(num + " (은)" + (num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
		
		//ex02(집가서 다시 이해)
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("값을 입력: ");
		int num1 = sc.nextInt();
		//System.out.println(num1   ?"지금 넣은 값은 3, 6, 9의 배수입니다" : "지금 넣은 값은 3, 6, 9의 배수가 아닙니다.");
		
		
	}

}
