package chapter05.ex03;

//import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		/*
		 배열방 1000개를 생성, 정수 배열,
		 4의 배수를 담는데 8의 배수는 담지 않도록 저장
		 
		 출력은 10개씩 끊어서 출력, For문을 사용해서 출력 <==세밀한 컨트롤은 보통 for문?
		 */
		
		/* ****내가한거*****
		int idx;
		int size = 1000;
		int arr1[] = new int[size];
		int i;
		
		idx = sc.nextInt();
		
		for (i = 1; true; i++) {
			if(i % 4 == 0) {
				if(i % 8 != 0) {
					i++;
				}
			}
			if (i == 1000) break;
			
		}
		for(i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			if(i%10==9) {
				System.out.print("\n\n");
			}
		} */
		
		//배열선언
		int[] arr1 = new int[1000]; //배열방 1000개 생성, index: 0 ~ 999, heap에 방 1000개 생성
		
		//각 배열 방에 값을 Insert
		for (int i = 0, a = 1; true; a++) { //i :배열의 방번호, a : 배열의 값 저장
			if (i == 1000) break;
			
			if ((a % 4 == 0) && (a % 8 != 0)) { //*&&생각하기??   //4의 배수이면서 8의 배수가 아닐때 둘다 true여야함
				arr1[i] = a;
				i++; // i : 999
				
			}
			
				
			}
			//출력 
			for (int i = 0; i < arr1.length; i++) { //*왜 int 안했다고 0 0으로 출력되었는지 생각하기??
				System.out.print(arr1[i] + "\t");
				
				if((i + 1) % 10 == 0) { //10의 배수일때 enter
					System.out.println();
				}
				
			
		}
		
		
	}

}
