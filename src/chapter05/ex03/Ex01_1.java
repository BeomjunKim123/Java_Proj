package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int[] arr1; //배열 변수 : arr1 <== 선언
		int n; //프로그램을 선택하는 변수 (1,2,3,4)
		int idx; //배열 변수에서 방의 크기를 저장하는 변수
		
		do {
		
		System.out.println("============================================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("============================================");
		
		System.out.println("1 ~ 4번 까지 번호를 입력 하세요>>>");
		n = sc.nextInt();
		
		if (n==1) {
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("배열 방의 크기를 정수값으로 입력 하세요>>>");
			idx = sc.nextInt();
			// 배열 방을 생성
			arr1 = new int[idx]; //콘솔에서 입력 받아서 배열 방 크기를 지정
			
			// 배열방의 for문을 사용해서 7의 배수와 8의 배수를 배열방에 저장
			int a = 0; //배열 방의 번호
			for(int i = 0; ; i++) { // i = 배열의 방에 저장되는 7의 배수와 9의 배수의 값, ; ;빈공간 무한루프를 돌려놓은거
				if ( i % 7 == 0 || i % 8 == 0) { // i가 7 or 8 의 배수일대
					arr1[a] = i;
					
					a++;	// 배열의 방 번호 증가
				}		
				if (a == idx ) break;
			}
			
			// for문을 사용해서 배열의 각 방의 내용을 출력
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] + " ");
			}
			System.out.print("\n\n");
			
			// Enhanced For 문을 사용해서 출력 : 모든방을 출력해줌
			for (int k : arr1) {
				System.out.print(k + " ");
			}
			System.out.print("\n\n");
			
			//Arrays.toString() 으로 출력
			System.out.println(Arrays.toString(arr1));
			System.out.println("========================");

			
			
		}else if (n==2) {
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
			System.out.println("배열의 방의 크기를 입력하세요>>>");
			idx = sc.nextInt();
			arr1 = new int[idx]; //배열의 방크기 지정
			
			int i = 0; //방 번호를 지정하는 변수
			int a; //배열방에 들어갈 값을 저장하는 변수
			
			// 배열의 각 방에 값을 저장하는 for 문
			for(a=1; ; a++) {
				
				if (a % 4 == 0) continue; //4의 배수면 저장하지않고 지나감
				
				arr1[i] = a;
				i++; //1씩증가
				
				if (i == idx) break;
			}
			
			// 배열의 지정된 내용을 출력 : For
			for ( i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] + " ");
			}
			System.out.println("\n\n");
			
			// 배열의 지정된 내용을 출력 : Enhanced For
			for (int k : arr1) {
				System.out.println(k + " ");
			}
			System.out.println("\n\n");
			
			// 배열의 지정된 내용을 출력 : Arrays.toString ()
			System.out.println(Arrays.toString(arr1));
			System.out.println("========================");
		
			
		}else if (n==3) {
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
			System.out.println("배열 방의 크기를 콘솔에서 정수값으로 넣어 주세요>>>");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			int i = 0; //배열의 방번호
			int a; //배열 방에 들어가는 값
			
			// 배열 (arr1)에 값을 insert
			for(a = 1; true; a++) { //true라고 넣어도 무한루프가 돌아감
				if (a % 3 == 0) { //3의 배수일때
					if (a % 6 != 0) { //6의 배수가 아닐때
						arr1[i] = a;
						i++;
						
					}
				}
				
				if (i == idx) break;
			}
			
			//For 문으로 출력
			for (i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println("\n \n"); //alt + 화살표 아래로 내려감
			
			// 배열의 지정된 내용을 출력 : Enhanced For
			for ( int k : arr1 ) {
				System.out.print(k + " ");
			}
			System.out.println("\n \n");
			
			// 배열의 지정된 내용을 출력 : Arrays.toString ()
			System.out.println(Arrays.toString(arr1));
			System.out.println("\n \n");
			
			
			
		}else if (n==4) {
			System.out.println("4번 선택 - 프로그램 종료 합니다.");
			break;
		}else {
			System.out.println("잘못입력 되었습니다. 1~4 정수를 입력해주세요.");
		}
	
	
		}while(true);
		sc.close();
	}

}
