package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 스캐너로 번호를 입력 받고 각 프로그램을 출력하는 프로그램을 작성 
		// for문 블락내에서 scanner를 인풋 받는다.
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		System.out.println("===========================");
		System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
		System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\" 이라고 출력하는 프로그램");
		System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
		System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
		System.out.println("5.프로그램 종료");
		System.out.println("===========================");
		a = sc.nextInt();
		
		if (a==1) {
			System.out.println("1부터 20까지의 홀수를 차례대로 출력하는 프로그램 \n");
			for(int i = 1; i < 20; i++ ) {
				if(i%2==1) {
					System.out.println(i + " ");
				}
			}
		} else if(a==2) {
			System.out.println("0이하의 정수를 입력받아 정수만큼 \\\"JAVA 프로그래밍\\\" 이라고 출력하는 프로그램 \n");
			System.out.println("10이하 정수를 입력해주세요>>>");
			int input = sc.nextInt();
			for(int i = 1; i <= input; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.println("JAVA 프로그래밍");
					break;
				}
				
			}
		} else if (a==3) {
			System.out.println("10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램 \n");
			int c = 0;
			int d = 0;
			System.out.println("10개의 정수를 입력해주세요>>>");
			int input = sc.nextInt();
			for(int i = 0; i < input; i++) {
				if(i%2==0) {
					c++;
				} else {
					d++;
					
					System.out.println("홀수의 개수는 : " + d +"짝수의 개수 : " + c);
					
				} 
				
			}
			
		} else if (a==4) {
			System.out.println("입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
			
		}
		
		
		} while(true);
		
		//sc.close();
	}

}
