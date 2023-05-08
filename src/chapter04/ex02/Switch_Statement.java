package chapter04.ex02;

public class Switch_Statement {
	public static void main(String[] args) {
		/*
		 	switch : 
		 	-- if 문은 참()일 경우 실행블락{}을 실행 후 break;가 자동으로 작동
		 	-- switch 문은 실행 후 해당 블락을 빠져 나오지 않는다. 강제로 해당 블락을 빠져 나오도록
		 	break; 넣어 줘야 한다.
		 */
		
		//1. switch 문에서 break;를 사용하지 않는 경우
		int val1 = 9;
		
		switch (val1) { //
		
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		default:
			System.out.println("F"); //case에 값이 존재하지 않는 경우, if else if else 와 같다.
		}
	}

}
