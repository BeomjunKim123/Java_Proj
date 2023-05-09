package chapter04.ex05;

public class Do_While_Statement {
	public static void main(String[] args) {
		/*
		  do while 문 : 조건과 상관없이 첫 1회는 무조건 실행 블락을 실행 시킨.
		  				조건을 확인 후 반복
		  
		  
		  1. while 문, 조건에 따라 실행됨 : 실행블락은 조건이 true 일때만 실행 시킴
		  	초기값
		  	while (조건) {
		  	 //실행블락
		  	 //증감식
		  	 }
		  	 
		  2. do while 문, 무조건 한번은 실행하게됨
		  	초기값
		  	do {
		  		//실행블락
		  		//증감식
		  	} while (조건) ;
		 
		
		 */
		
		//1. while 문 :
		System.out.println("=====while 문 =====");
		int a = 0;
		while (a < 0) { // false 이므로 실행 블락이 실행 되지 않는다.
			System.out.println(a + " ");
		}
		
		//2. do while 문
		System.out.println("====do while 문 ====");
		
		do  {
			System.out.println(a + " "); //조건과 상관없이 1번은 실행블락이 작동됨
		}while (a < 0);
		
		//3. 반복 횟수가 10번인 경우 : while문과 do while문 비교
		System.out.println("===3. 반복 횟수가 10번인 경우 : while 문과 do while 문 비교===");
		
		System.out.println("==While==");
		a = 0; //변수의 값을 변경
		while (a < 10) { //0 ~ 9까지 10번 출력
			System.out.println(a + " ");
			a++;
		}
		
		System.out.println();
		System.out.println("==Do While==");
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while (a < 10);
		
	}

}
