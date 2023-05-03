package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		
		//1. Scanner 등록
		//2. 아버님 이름, 어머님 이름, 형제 이름, 자신이름 : sc.next();
			//아버님 나이, 어머님 나이, 형제 나이, 자신의 나이 : sc.nextInt();
		//3. 스캐너로 받은 변수의 값을 출력
		//4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2자리까지만 출력
		
		Scanner sc = new Scanner(System.in);
		
		String name; //이름
		String name1;
		String name2;
		String name3;
		
		int age; //아버님 나이
		int age1; //어머님 나이
		int age2; //형제 나이
		int age3; //자신의 나이
		
		System.out.println("아버님의 이름을 입력 하세요>>>");
		name = sc.next();
		System.out.println("어머님의 이름을 입력 하세요>>>");
		name1 = sc.next();
		System.out.println("형제의 이름을 입력 하세요>>>");
		name2 = sc.next();
		System.out.println("자신의 이름을 입력 하세요>>>");
		name3 = sc.next();
		
		System.out.println("아버님의 나이를 입력 하세요>>>");
		age = sc.nextInt();
		System.out.println("어머님의 나이를 입력 하세요>>>");
		age1 = sc.nextInt();
		System.out.println("형제의 나이를 입력 하세요>>>");
		age2 = sc.nextInt();
		System.out.println("자신의 나이를 입력 하세요>>>");
		age3 = sc.nextInt();
		
		int sum = age + age1 + age2 + age3; //나이의 합계
		double avg =  sum / 4.0;
		
		System.out.printf("아버지 이름은 %s, 어머님 이름은 %s, 형제의 이름은 %s, 자신의 이름은 %s 입니다.\n",
				name, name1, name2, name3);
		System.out.printf("아버지 나이는 %d, 어머님 나이는 %d, 형제의 나이는 %d, 자신의 나이는 %d 입니다.\n",
				age, age1, age2, age3);
		System.out.printf("전체 나이의 합은 %d 이고, 평균은 %5.2f 입니다.", sum, avg);
	
				
	}

}
