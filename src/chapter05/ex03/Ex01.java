package chapter05.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		do {
		
		//배열에 저장후 출력 : 완료 시간 : 5:30까지
		System.out.println("============================================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("============================================");
		
		System.out.println("1 ~ 4번 까지 번호를 입력 하세요>>>");
		a = sc.nextInt();
		
		if (a==1) {
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			int[] arr = new int[10];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("7의 배수 : ");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 7 == 0) {
					System.out.println(arr[i] + " ");
				}
				System.out.println("8의 배수 : ");
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] % 8 == 0) {
						System.out.println(arr[j] + " ");
					}
					
				}
			}
			
		}else if (a==2) {
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
			int[] arr = new int[100];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				arr[i]=i+1;
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]=i+1);
			}
			
			
		}else if (a==3) {
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
			
		}else if(a==4) {
			System.out.println("4.프로그램 종료");
			break;
		} else {
			System.out.println("잘못 입력 했습니다. (1 ~ 4번까지의 정수를 입력하세요.");
		}
		
		}while(true); 
			
		System.out.println("while 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
		sc.close();
	}

}
