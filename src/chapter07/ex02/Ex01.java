package chapter07.ex02;

class C {
	void print (int[] a, double[] b) {
		
		// a 배열의 값을 for 문으로 출력
		System.out.println("==정수 매열 출력==");
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n\n");
		
		//b배열의 값을 for문으로 출력
		System.out.println("==더블 배열 출력==");
		for (int i=0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\n\n");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		//1. 객체생성
		C c1 = new C();
		
		//2. 배열 생성
		int [] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		
		c1.print(arr1, new double[] {11.11, 12.12, 13.13, 14.14, 15.15});
		
		
	}

}
