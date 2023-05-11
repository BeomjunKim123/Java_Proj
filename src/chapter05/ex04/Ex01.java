package chapter05.ex04;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  arr1 = 4행 100열 2차원 배열 방을 생성 하세요.
		  	0 : 10의 배수만 저장
		  	1 : 3의 배수만 저장
		  	2 : 3배수지만 6의 배수를 저장하지 말고 저장
		  	3 : 7의 배수, 8의 배수 저장
		  	
		  	//for문을 사용해서 출력.
		 */
		
		//1.배열 선언
		int[][] arr1 = new int[4][100];
		
		System.out.println("행의 갯수 : " + arr1.length);
		System.out.println("0 행의 열의 갯수 : " +arr1[0].length);
		System.out.println("1 행의 열의 갯수 : " +arr1[1].length);
		System.out.println("2 행의 열의 갯수 : " +arr1[2].length);
		System.out.println("3 행의 열의 갯수 : " +arr1[3].length);
		
		//2.배열의 각 행에 값을 저장
		for(int i = 0; i < arr1.length; i++) { //i : 행을 loop, 0, 1, 2, 3
				if (i==0) { // 10의 배수를 저장함.
					for(int j = 0, a = 10; j < arr1[i].length; j++) { //j : 열을 loop, 한행일때 열이 계속 loop가 돌아감, 0, 1, 2 ... 99
					// 3의 배수를 저장하는 변수 선언
					arr1[i][j] = a;
					a += 10;
						
				}
				}else if (i==1) { //3의 배수만 저장
					for(int j = 0, a = 3; j < arr1[i].length; j++, a+=3) { //j : 열을 loop, 한행일때 열이 계속 loop가 돌아감, 0, 1, 2 ... 99
						// 3의 배수를 저장하는 변수 선언
						//int a = 3;
						arr1[i][j] = a;
						//a+=3;
						
					}
				}else if (i==2) { //3의 배수지만 6의 배수는 저장안함
					for(int j = 0, a = 3; j < arr1[i].length; a++) { //j : 열을 loop, 한행일때 열이 계속 loop가 돌아감, 0, 1, 2 ... 99
						//위에 괄호에 j++를 넣으면 결과가 6의 배수는 0으로 출력이 됨, j는 값을 넣었을때만 적용이 되어야함
						//int a = 3; //int변수를 밖에서 선언하면 왜 3만나오는지??
						
						if( a % 6 == 0) continue; //6의 배수는 저장하지 않고
						arr1[i][j] = a;
						j++;
					}
				}else if (i==3) { //7의 배수, 8배수 저장
					for(int j = 0, a = 1; j < arr1[i].length; a++) { //j : 열을 loop, 한행일때 열이 계속 loop가 돌아감, 0, 1, 2 ... 99
						// 각 방의 값을 저장하는 변수 선언 : a;
						if (a % 7 == 0 || a % 8 == 0) {
							arr1[i][j] = a; 
							j++;	
						}
						
						
					}
				}
			} 
			
			// 출력 구문
			for (int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		
	}



		
		
	