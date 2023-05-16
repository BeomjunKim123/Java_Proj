package chapter07.ex02;

import java.util.Arrays;

class F {
		//1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력 : int
		//2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력 : int
		//3. 메소드 : 두 배열의 각 방의 내용을 곱하기 출력 : int
		//4. 메소드 : 두 배열의 각 방의 내용을 나누기 출력 : double

		void arrSum (int[] a, int[] b) {
			System.out.println("두 배열의 합은 : ");
			for(int i = 0;  i < a.length; i++){
				System.out.print(a[i] + b[i] + " ");
			}
			System.out.println("\n\n");
			
		}
		void arrDiff (int[] a, int[] b) {
			System.out.println("두 배열의 빼기는 : ");
			for(int i = 0;  i < a.length; i++){
				System.out.print(a[i] - b[i] + " ");
			}
			System.out.println("\n\n");
			
		}
		void arrMul (int[] a, int[] b) {
			System.out.println("두 배열의 곱하기는 : ");
			for(int i = 0;  i < a.length; i++){
				System.out.print(a[i] * b[i] + " ");
			}
			System.out.println("\n\n");
			
		}
		void arrDiv (int[] a, int[] b) {
			System.out.println("두 배열의 나누기는 ");
			for(int i = 0;  i < a.length; i++){
				System.out.print((double)(a[i] / (double)b[i]) + " ");
			}
			System.out.println("\n\n");
			
		}
}

public class Ex04 {
	public static void main(String[] args) {
		//1. 정수를 담는 배열 arr1 방 100개를 생성 : 7의 배수만 저장
			//7 14 21...
		
		System.out.println("==1번 문제==");
		int[] arr1 = new int[100];  //index : 0 ~ 99
			//for문을 사용해서 각 방에 7의 배수를 저장, j : 7의 배수를 저장하는 변수
			for (int i = 0, j = 7; i < arr1.length; i++) {
				arr1[i] = j;
				j+=7;      //j = j + 7
				System.out.print(arr1[i] + " ");
			}
			System.out.println("\n\n");
			
			System.out.println("==2번 문제==");
			//2. 정수를 담는 배열 arr2 방 100개 생성 : 4의 배수만 저장하는데 8의 배수는 저장하지 않도록
				//4 12 20
			int[] arr2 = new int[100]; //index : 0 ~ 99
				// j : 4의 배수만 저장하는 변수
			for (int i = 0, j = 1; true; j++) {
				
				 //방번호(i) : 100일때 for문을 빠져나옴
				 
				if (j % 4 == 0 && j % 8 != 0) { //4의 배수이고 8의 배수가 아닐때만 값을 넣는다.
				arr2[i] = j; //j를 각방에 넣겟다
				System.out.print(arr2[i] + " "); //방에 넣은 값을 출력해줌
				i++;   //값이 저장되었을때만 방의 갯수를 증가
				
				}
				if (i == 100) break; //방번호 (i) : 100번방 일때 for문을 빠져 나옴
			}
			System.out.println("\n\n");
			
			System.out.println("===마지막 방 출력===");
			//System.out.println(arr1[99]);
			//System.out.println(arr2[99]);
			
			//3. 각 메소드 호출후 출력
			F f1 = new F();
			
			f1.arrSum(arr1, arr2);
			f1.arrDiff(arr1, arr2);
			f1.arrMul(arr1, arr2);
			f1.arrDiv(arr1, arr2);
	}

}

	

	//1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력 : int
	//2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력 : int
	//3. 메소드 : 두 배열의 각 방의 내용을 곱하기 출력 : int
	//4. 메소드 : 두 배열의 각 방의 내용을 나누기 출력 : double
	
	/*
	void print (int[] a, int[] b) {
		
		//1. 배열의 내용을 출력
		
		System.out.println("==인풋 받은 배열의 +e의 내용을 출력==");
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			
			if(a[i] % 7 == 0) {
			System.out.print(a[i] + b[j] + " ");
			
			}
		}
		System.out.println("\n\n");
		
		System.out.println("==인풋 받은 배열의 -e의 내용을 출력==");
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			System.out.print(a[i] - b[j] + " ");
		}
		System.out.println("\n\n");
		
		System.out.println("==인풋 받은 배열의 -e의 내용을 출력==");
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			System.out.print(a[i] * b[j] + " ");
		}
		System.out.println("\n\n");
		
		System.out.println("==인풋 받은 배열의 -e의 내용을 출력==");
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			System.out.print(a[i] / b[j] + " ");
		}
		System.out.println("\n\n");
		
	}
	
}
*/
//public class Ex04 {
//	public static void main(String[] args) {
		
		/*
		//1. 정수를 담는 배열 arr1 방 100를 생성 : 7의 배수만 저장
			//7 14 21...
		//2. 정수를 담는 배열 arr2 방 100개 생성 : 4의 배수만 저장하는데 8의 배수는 저장하지 않도록
			//4 12 20
		
		F f1 = new F();
		
		int[] arr1 = new int[100]; 
		double[] arr2 = new double[100] ; 
		
		
		int[] arr1 = new int[100]; 
		
		int count = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			   arr1[i] = i*7;
			   count++;
			   if (arr1[i] >= 100) {
			      break;
			   }
			}
		
		double[] arr2 = new double[100] ; 
		int index = 0;

		for (int i = 1; i <= arr2.length; i++) {
		    if (i % 4 == 0 && i % 8 != 0) {
		        arr2[index] = i;
		        index++;
		    }
		}
		
		f1.print(arr1, arr2, 7);
		*/
	
//	}

//}
