package chapter04.ex05;

import java.util.Scanner;

public class Do_While_Statement02 {
	public static void main(String[] args) {
		
		// do while 문을 사용해서 무한 루프를 돌립니다.
		//		do while 문 내에서 if를 사용
		// 스캐너에서 정수 값을 입력 받아서 
		// 4 : 무한루프를 빠져 나온다. (프로그램을 빠져 나온다.)
		// 1 : "평균출력"
		// 2 : "합계출력"
		// 3 : "이름출력"
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		
			System.out.println("===========================================");
			System.out.println("1.평균출력 | 2.합계출력 | 3.이름출력 | 4.프로그램 종료");
			System.out.println("===========================================");
			System.out.println("위의 번호를 입력하세요>>>>");
			a = sc.nextInt(); //콘솔에서 정수를 input 받아서 a 변수에 할당.
			
			if (a == 1) {
				System.out.println("1.평균출력");
			}else if(a==2) {
				System.out.println("2.합계출력");
			}else if(a==3) {
				System.out.println("3.이름출력");
			}else if(a==4) {
				System.out.println("4.프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력 했습니다. (1 ~ 4번까지의 정수를 입력하세요.");
			}
		
		} while (true);
		
		//위에 브레이크 지우면 도달할수없는 코드라고 에러가 뜸
		System.out.println("while 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
		sc.close(); //
		
		
	/*	int a;
		int b;
		int c;
		int d;
		
		do {
			System.out.println("1.평균출력");
			a = sc.nextInt();
		} while(a <= 1 );
		
		do {
			System.out.println("2.합계출력");
			a = sc.nextInt();
		} while(a <= 2 );
		do {
			System.out.println("3.이름출력);
			a = sc.nextInt();
		} while(a <= 3 );
		do {
			System.out.println("1.평균출력");
			a = sc.nextInt();
		} while(a <= 4 );
		*/
		
	}

}
