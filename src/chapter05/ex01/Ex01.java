package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  배열 방 100개를 생성후 3의 배수만 저장
		 */
		
		/*
		int[] arr3 = new int[100];
		
		for (int i = 0; i < 100; i++) {
			if(i%3==0)
			arr3[i] = i + 1;
		}
		for (int i = 0; i < 100; i++) {
			if(i%3==0)
			System.out.println("arr3 변수의 [" + i + "] 번째 방의 값을 출력 : " + arr3[i]);
		} */
		
		// 1.배열 변수 선언 및 방크기 지정
		int c = 100;
		
		int[]arr1 = new int[c]; //index 0 ~ 99
		
		System.out.println(arr1.length); //방의 개수를 출력
		
		int a = 0;
		
		//arr1 배열의 각 방에 값을 저장하는 for
		for (int i = 0; i < arr1.length; i++) {
			a += 3; // a = a + 3;
			arr1[i] = a;
			
		}
		
		// arr1 배열의 각 방에 값을 출력 하는 for 
		System.out.println("=======for 문을 사용해서 출력========");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "] 의 값은 : " + arr1[i]);
		}
		
		System.out.println("========Enhanced For : 향상된 For ==========");
		//배열의 첫번째 방부터 마지막 방까지 자동으로 그 값을 출력 할때 사용
		for(int k : arr1) {
			System.out.println(k + " ");
		}
		System.out.println("\n\n");
	}

}
