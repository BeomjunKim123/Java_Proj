package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//스캐너로 money를 인풋 받습니다.
				//0 ~ 3000 : "걸어서 다닙니다"
				//3001 ~ 30000 : "지하철을 타고 다닙니다"
				//30001 ~ 100000 : "택시를 타고 다닙니다"
				//100000 ~ : "비행기를 타고 다닙니다"
			
			/*Scanner sc = new Scanner(System.in);
			
			
			
			System.out.println("돈을 입력하세요>>>");
			int money = sc.nextInt();
			
			
			if (money > 0 && money < 3000 ) { // True && false ==> false
				System.out.println("걸어서 다닙니다");
			} else if(money > 3001 && money < 30000) { //True && false ==> false
				System.out.println("지하철을 타고 다닙니다");
			} else if(money > 30001 && money < 100000) { //True && false ==> false
				System.out.println("택시를 타고 다닙니다");
			} else if(money > 100000 && money < 1000000000) { //True && true ==> true
				System.out.println("비행기를 타고 다닙니다");
			} else { 
				//위의 조건이 모두 만족 하지 않을때, switch문의 default
				System.out.println("원화채굴 하러 갑니다");
			} ***내가한거***
			*/
		
		int money;
		// 1. scanner 등록 (콘솔로 인풋 ==> 변수)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 자산을 입력하세요>>>>");
		
		money = sc.nextInt();
		
		if (0 <= money && 3000 > money ) {
			System.out.println("걸어서 다닙니다");
		} else if (3000 <= money && 30000 > money ) {
			System.out.println("지하철을 타고 다닙니다");
		} else if (30000 <= money && 100000 > money ) {
			System.out.println("택시를 타고 다닙니다");
		} else {
			System.out.println("비행기를 타고 다닙니다");
		}
		sc.close(); //스캐너 종료, 메모리에서 삭제
	}

}
