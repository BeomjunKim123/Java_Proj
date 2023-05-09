package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 단축키 : ctrl + shift + F <==코드를 자동정렬
		// 단축키 : ctrl + alt + down(화살표) : 선택된 라인을 복사
		// 단축키 : alt + up/down : 선택 라인을 이동
		
		// 스캐너로 번호를 인풋 받아서 4번을 누를때까지는 계속 무한루프
		// do while, if, for-for
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		
		System.out.println("========================================================");
		System.out.println("1.구구단 출력 | 2.19단 출력 | 3.19단중 7배수단 출력 | 4.프로그램 종료");
		System.out.println("========================================================");
		System.out.println("위의 번호를 입력하세요>>>>");
		a = sc.nextInt();
		
		    if (a==1) {
			System.out.println("1.구구단 출력");
			for(int i = 1; i < 10; i++) {
				//System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j + "\n");
					}
				}
		
		    }else if(a==2) {
		    	System.out.println("2.19단 출력");
		    	for(int i = 1; i < 20; i++) {
		    		//System.out.println(i + "단");
		    		for (int j = 1; j < 20; j++) {
		    			System.out.println(i + " * " + j + " = " + i*j + "\n");
		    		}
		    	}
				
			}else if(a==3) {
				System.out.println("3.19단중 7의 배수단 출력");
				for(int i = 1; i < 20; i++) {
					if(i%7==0)
					//System.out.println(i + "단");
					for (int j =1; j < 20; j++) {
						System.out.println(i + " * " + j + " = " + i*j + "\n");
					}
				}
			}else if(a==4) {
				System.out.println("4.프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력 했습니다. (1 ~ 4번까지의 정수를 입력하세요.");
			}
			
		}while (true);
		
		System.out.println("while 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
		sc.close();
		
	}

}
