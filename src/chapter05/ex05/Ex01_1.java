package chapter05.ex05;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex01_1 {
	public static void main(String[] args) {
		//강사님 답
		
		/*
		  2차원 정방형 배열 : 
		  	4행 200열 배열 선언
		  	 	0행 : 5의 배수
		  	 	1행 : 3의 배수
		  	 	2행 : 7, 8의 배수
		  	 	3행 : 4의 배수이면서 7의 배수인값 : 28
		 */
		
		int [][] arr1 = new int [4][200];
		//2. 배열의 각 행에 값 입력
		for (int i = 0; i < arr1.length; i++) {
			if (i==0) {
				for(int j = 0, a = 5; j < arr1[i].length; j++, a+=5) {
					arr1[i][j] = a;
				}
			}else if(i==1) {
				for(int j = 0, a = 3; j < arr1[i].length; j++, a+=3) {
					arr1[i][j] = a;
				}
				
			}else if(i==2) { // 7, 8의 배수
				for(int j = 0, a = 1; j < arr1[i].length; j++, a++) {
					
					if (a % 7 == 0 || a % 8 == 0) {
						
						arr1[i][j] = a;
						//j++; //*왜 밑에다가 적용하지?
					}
				}
			}else if(i==3) {
				for(int j = 0, a = 1; j < arr1[i].length; a++) {

					if (a % 4 == 0 && a % 7 == 0) { //4의 배수이면서 7의 배수 일때 실행
						arr1[i][j] = a;
						j++;
					}
				}
			}
		}
		
		// 3. 출력 
		System.out.println("==1.For문으로 출력==");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==2.Enhanced For 문으로 출력==");
		for (int [] k : arr1 ) {
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		System.out.println("==3. Arrays.toString문으로 출력==");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		System.out.println(Arrays.toString(arr1[3]));
	}

}
