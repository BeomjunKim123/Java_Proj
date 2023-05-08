package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//1. Scanner 등록(ctrl + shift + o)
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 선택 변수
		int select; //1. 학점의 합계/평균, 2. 홀수/짝수 확인, 3. 같은 이름을 식별
		
		//국어 / 영어 / 수학 점수를 인풋 받는 변수 선언
		int kor;
		int eng;
		int math;
		
		// 정수 값을 인풋 받아서 홀수/짝수 인지 확인 하는 프로그램에 사용하는 변수
		int a;
		
		//두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		String aName;
		String bName;
		
		System.out.println("========================================");
		System.out.println("1.학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름 식별");
		System.out.println("=========================================");
		
		//사용자로 부터 프로그램 선택
		select = sc.nextInt();
		
		//if 조건으로 프로그램 실행
		if (1 == select) {
			//스캐너로 부터 국어/영어/수학 인풋받아서 합계와 평균을 출력
			System.out.println("1번 항목을 출력 했습니다.");
		} else if (2 == select ) {
			//a변수에 정수 값을 인풋받아서 홀수/짝수 인지 출력
		} else if (3 == select) {
			//aName, bName 두 변수의 문자열을 인풋 받아서
		}
		
		//스캐너 종료 : 사용 후 메모리에서 제거
		sc.close();
	}

}
