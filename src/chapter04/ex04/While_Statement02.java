package chapter04.ex04;

public class While_Statement02 {
	public static void main(String[] args) {
		/*
		  반복문 : 무한루프 빠지지 않도록 해야한다.
		 */
		
		System.out.println("===무한 루프 탈출===");
		
		boolean abc = true;
		
		int i = 1; //while밖에서 변수 선언해야함
		while (abc) { //무한 루프 : 100번 출력
			
			
			System.out.println("무한 루프" + 1);
			
			if (i == 100) {break; } //i가 100일때 while 블락을 탈출
			
			i++;
		}
	}

}
