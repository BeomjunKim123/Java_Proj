package chapter04.ex06;

import java.util.Scanner;

public class Ex01_1 {
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
			System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			System.out.println(" Type 1 : 증가값으로 홀수 출력");
			for(int i = 1; i <= 20; i+=2 ) {
				System.out.println(i + " ");
			}
			System.out.println("\n\n");
			
			System.out.println("Type 2 : if조건으로 홀수 출력");
			for(int i = 1; i <= 20; i++) {
				if(i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println("\n\n");
			
		}else if (a==2) {
			System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \\\"JAVA 프로그래밍\\\" 이라고 출력하는 프로그램");
			int b; //스캐너로 10이하의 정수 값을 인풋 받는 변수
			System.out.println(" 10 이하의 정수를 입력하세요>>>");
			b = sc.nextInt();
			
			for(int i = 1; i <= b; i++) {
				System.out.println("Java 프로그래밍 " + i);
			}
			
		}else if (a==3) {
			System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			
			System.out.println("정수 10개를 공백을 사용해서 입력하세요 >>>");
			int c, count = 0 ; //c : 스캐너로 받아서 저장하는 변수, count : 짝수만 카운트 하는 변수
			for (int i = 1; i <= 10; i++) {
				c = sc.nextInt(); 
				if (c == 0) {
					continue;
				}
				if (c%2 == 0) {
					count++;
				}
			}
			System.out.printf("입력 받은 짝수는 %d 입니다. ", count);
			System.out.println("\n\n");
		
		}else if (a==4) {
			System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("성적을 몇개를 작성할지 정수로 넣어주세요.>>>");
			int b, c, sum = 0, count = 0; //b : 스캐너롤 인풋받을 변수,c: 정수 변수
			//b : 성적의 개수 : 3 (국어, 영어, 수학)
			//c : 점수를 담을 변수 : for 문을 사용해서 Scanner 로 인풋 받는 변수
			//sum : 인풋 받은 점수를 합하는 변수, 
			//count : 과목의 개수
			b = sc.nextInt();
			for (int i = 1; i < b; i++) {
				System.out.println("각 과목의 점수를 공백을 사용해서 입력한 개수만큼 넣어주세요>>>");
				c = sc.nextInt();
				
				sum += c; //sum = sum + c
				count++;
			}
			double avg = sum/count;
			
			System.out.printf("입력한 과목수는 : %d이고, 합계는 : %d 이고, 평균은 : %.2f");
			System.out.println();
		
		}else if (a==5) {
			System.out.println("5. 프로그램 종료");
		}else {
		System.out.println("잘못 입력 했습니다. 1~5사이의 점수를 입력 하세요.");
		break;
		}
		
	} while (true);
	sc.close();	
	}
}
