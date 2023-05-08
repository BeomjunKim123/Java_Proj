package chapter03.ex06;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		
		System.out.println("정수 값 하나를 넣어주세요 >>>");
		a = sc.nextInt();
		System.out.println((a%2==0) ? "짝수입니다" : "홀수입니다");
		
		//2. Ex02
		System.out.println("또 다른 정수값 하나를 넣어 주세요");
		a = sc.nextInt();
		System.out.println((a%3==0 || a%6==0 || a%9==0) ? "369의 배수입니다." : "369의 배수가 아닙니다.");
	}

}
