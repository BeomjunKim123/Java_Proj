package chapter04.ex01;

import java.util.Scanner;

public class Ex02_1 {
	public static void main(String[] args) {
		
		//1. Scanner 등록(ctrl + shift + o)
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 선택 변수
		int select; //1. 학점의 합계/평균, 2. 홀수/짝수 확인, 3. 같은 이름을 식별
		
		//국어 / 영어 / 수학 점수를 인풋 받는 변수 선언
		int kor;
		int eng;
		int math;
		
		//System.out.println("국어점수를 입력하세요>>>");
		//kor = sc.nextInt();
		//System.out.println("영어점수를 입력하세요>>>");
		//eng = sc.nextInt();
		//System.out.println("수학점수를 입력하세요>>>");
		//math = sc.nextInt();
		
		//int sum = kor + eng + math;
		//double avg = sum / 3.0;
		//System.out.printf("학점의 합은 %d 이고, 평균은 %5.2f 입니다.\n", sum, avg);
		
		// 정수 값을 인풋 받아서 홀수/짝수 인지 확인 하는 프로그램에 사용하는 변수
		int a;
		
		//System.out.println("위 프로그램 번호를 입력 하세요>>> ");
		//a = sc.nextInt();
		
		//if (a % 2 == 0) {
		//	System.out.println("짝수입니다");
	 	//} else {
	 	//	System.out.println("홀수입니다");
	 	//}
		
		//두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		//String aName;
		//String bName;
		
		String aName;
		String bName;
		
		//System.out.println("이름1을 입력하세요");
		//aName = sc.nextLine();
		//System.out.println("이름2을 입력하세요");
		//bName = sc.nextLine();
		
		//if (aName.equals(bName)) {
        //    System.out.println("두 이름은 같습니다.");
        //} else {
        //    System.out.println("두 이름은 다릅니다.");
       
		
		System.out.println("=========================================");
		System.out.println("1.학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름 식별");
		System.out.println("=========================================");
		
		
		
		//사용자로 부터 프로그램 선택
		System.out.println("위 프로그램 번호를 입력 하세요>>> ");
		select = sc.nextInt();
		
		
		
		//if 조건으로 프로그램 실행
		if (1 == select) {
			//스캐너로 부터 국어/영어/수학 인풋받아서 합계와 평균을 출력
			System.out.println("1번 항목을 출력 했습니다.");
			System.out.println("콘솔에 국어 영어 수학 점수를 공백/엔터로 정수 값으로 넣어주세요>>>");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			int sum = kor + eng + math; //sum 지역변수 : 블락 내에서만 사용됨
			double avg = sum / 3.0;
			System.out.printf("학점의 합은 %d 이고, 평균은 %5.2f 입니다.\n\n", sum, avg);
			
		} else if (2 == select ) {
			//a변수에 정수 값을 인풋받아서 홀수/짝수 인지 출력
			System.out.println("2번 항목을 출력 했습니다.");
			System.out.println("정수 값 하나를 입력하세요>>>");
			a = sc.nextInt();
			
			System.out.println((a % 2 == 0) ? "짝수입니다" : "홀수입니다");
			
		} else if (3 == select) {
			//aName, bName 두 변수의 문자열을 인풋 받아서 두 문자열이 같은 이름인지 식별
			System.out.println("3번 항목을 출력 했습니다.");
			System.out.println("문자열 2개를 공백/엔터로 구분해서 입력해 주세요>>>");
			aName = sc.next();
			bName = sc.next();
			
			if (aName.equals(bName) ) { //String 에서 두 값을 비교 하는 것이 equals <== Heap에 저장된값
				System.out.println("두 이름은 같습니다.");
			} else
				System.out.println("두 이름은 다릅니다.");
		}
		
		//스캐너 종료 : 사용 후 메모리에서 제거
		sc.close();
	  }
   }

