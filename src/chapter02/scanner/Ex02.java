package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 스캐너 등록
		// 2. 우리 가족의 이름(String) 및 몸무게 (double) 를 인풋 받고, 몸무게의 합과, 평균을 
		//구해서 출력 하는 프로그램을 작성
			// sc.nextDouble();
		
		Scanner sc = new Scanner(System.in);
		
		String name; //이름
		String name1;
		String name2;
		String name3;
		
		double weight; //몸무게
		double weight1;
		double weight2;
		double weight3;
		
		System.out.println("아버님의 이름을 입력 하세요>>>");
		name = sc.next();
		System.out.println("어머님의 이름을 입력 하세요>>>");
		name1 = sc.next();
		System.out.println("형제의 이름을 입력 하세요>>>");
		name2 = sc.next();
		System.out.println("자신의 이름을 입력 하세요>>>");
		name3 = sc.next();
		
		System.out.println("아버님의 몸무게를 입력 하세요>>>");
		weight = sc.nextDouble();
		System.out.println("어머님의 몸무게를 입력 하세요>>>");
		weight1 = sc.nextDouble();
		System.out.println("형제의 몸무게를 입력 하세요>>>");
		weight2 = sc.nextDouble();
		System.out.println("자신의 몸무게를 입력 하세요>>>");
		weight3 = sc.nextDouble();
		
		double sum = weight + weight1 + weight2 + weight3; //몸무게의 합계
		double avg =  sum / 4.0;
		
		System.out.printf("아버지 이름은 %s, 어머님 이름은 %s, 형제의 이름은 %s, 자신의 이름은 %s 입니다.\n",
				name, name1, name2, name3);
		System.out.printf("아버지 몸무게는 %f, 어머님 몸무게는 %f, 형제의 몸무게는 %f, 자신의 몸무게는 %f 입니다.\n",
				weight, weight1, weight2, weight3);
		System.out.printf("전체 몸무게의 합은 %.2f 이고, 평균은 %.2f 입니다.", sum, avg);
		
	}

}
