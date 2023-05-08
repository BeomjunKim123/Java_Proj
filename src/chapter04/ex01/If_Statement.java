package chapter04.ex01;

public class If_Statement {
	public static void main(String[] args) {
		/*
		   제어문 - if(실행문 마지막에 break), switch(실행문에서 빠져나오기 위해서
		   									항상 break를 넣어줘야함)
		   
		   //If 문 사용하기
		   	1. Type 1 : 조건이 1개일때  <== 실행블락의 {} 생략 가능.
		    - if (조건) { 조건이 참일때 실행 블락 }
		    - if (조건) 조건이 참일때 실행 블락;
		    
		    2. Type 2 : 조건이 2개일때, 삼항 연산자로 처리 가능
		 	삼항 : (조건) ? 참 : 거짓;
		    - if (조건) {조건이 참일때 실행 블락
		    } else {
		    	조건이 거짓일때 실행하는 블락
		    	}
		    	
		    3. Type 3 : 조건이 여러개 일때
		    - if (조건1) { 조건1이 참일때 실행 블락
		    	} else if (조건2) { 조건2가 참일때 실행하는 블락
		    	} else if (조건3) { 조건3가 참일때 실행하는 블락
		    	} else if (조건4) { 조건4가 참일때 실행하는 블락
		    	} else { 위의 조건이 모두 만족하지 않을때 실행하는 블락
		    	}
		 */
		
		//Type 1 예제 : 조건이 1개일때
		int val1 = 5;
		
		if (val1 > 3) {
			System.out.println("실행1"); //조건이 True이므로 "실행1"이 출력
			
			System.out.println("==================");
			// 조건이 1개일때 {} 중괄호 생략 가능
		if (val1 > 3) 
			System.out.println("실행2");
			
		System.out.println("==================");
		//Type 2 : 조건 2개일때
		if (val1 < 3) {
			System.out.println("실행3"); //조건이 True일때 실행
		} else {
			System.out.println("실행4"); //조건이 False일때 실행
		}
		
		// if ~ else <==> 삼항 연산자로 변환 가능
		System.out.println((val1 < 3) ? "참" : "거짓");
		
		System.out.println("==================");
		//Type 3 : 조건이 여러개일때
		
		int val2 = 85;
		
		if (val2 > 90) {
			System.out.println("A 학점 입니다. ");
		} else if (val2 > 80) {
			System.out.println("B 학점 입니다. ");
		} else if (val2 > 70) {
			System.out.println("C 학점 입니다. ");
		} else if (val2 > 60) {
			System.out.println("D 학점 입니다. ");
		} else {
			System.out.println("F 학점 입니다. ");
		}
		
		System.out.println("=======조건의 순서를 바꿀 경우 윈치않는 내용이 출력 될 수 있다. ======");
		
		int val3 = 95; //조건을 적용할때 세밀하게 적용 해야 할 필요도 있다.
		
		if (val3 > 60) {
			System.out.println("D 학점");
		} else if(val3 > 70) {
			System.out.println("C 학점");
		} else if(val3 > 80) {
			System.out.println("B 학점");
		} else if(val3 > 90) {
			System.out.println("A 학점");
		} else { 
			//위의 조건이 모두 만족 하지 않을때, switch문의 default
			System.out.println("F 학점");
		}
		
		System.out.println("====조건을 부여할때 세밀 하게 적용해야할 필요도 있다.====");
		
		int val4 = 95; //조건을 적용할때 세밀하게 적용 해야 할 필요도 있다.
		 
		if (val4 > 60 && val4 < 70 ) { // True && false ==> false
			System.out.println("D 학점");
		} else if(val4 > 70 && val4 < 80) { //True && false ==> false
			System.out.println("C 학점");
		} else if(val4 > 80 && val4 < 90) { //True && false ==> false
			System.out.println("B 학점");
		} else if(val4 > 90 && val4 < 100) { //True && true ==> true
			System.out.println("A 학점");
		} else { 
			//위의 조건이 모두 만족 하지 않을때, switch문의 default
			System.out.println("F 학점");
		}
		
		}
	}

}
