package chapter05.ex05;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  2차원 정방형 배열 : 
		  	4행 200열 배열 선언
		  	 	0행 : 5의 배수
		  	 	1행 : 3의 배수
		  	 	2행 : 7, 8의 배수
		  	 	3행 : 4의 배수이면서 7의 배수인값 : 28
		 */
		
		// 1. 배열 변수 선언
		int[][] arr1 = new int[4][200];
		
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);
		
		// 2. 배열의 각 행에 값 입력
		for(int i = 0; i < arr1.length; i++) {
			if (i==0) {
				for (int j = 0, a = 5; j < arr1[i].length; j++, a+=5) {
					arr1[i][j] = a;
				}
				
			}else if(i==1) {
				for (int j = 0, a = 3; j < arr1[i].length; j++, a+=3) {
					arr1[i][j] = a;
				}
						
			}else if(i==2) {
				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) {
					if ((a % 7 == 0) || (a % 8 == 0)) {
						arr1[i][j] = a;
					}
				}
				
			}else if(i==3) {
				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) {
					if ((a % 4 != 0) || (a % 7 != 0)) continue; 
						arr1[i][j] = a;
					
				}
				
			}
		}
		
		// 3. 출력 (For, Enhanced For, Arrays.toString () )
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
		
}


