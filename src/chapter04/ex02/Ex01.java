package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  1. Scanner로 정수 1, 2, 3을 인풋 받아서
		  	1 : "금메달 입니다."
		  	2 : "은메달 입니다."
		  	3 : "동메달 입니다."
		  	그외 정수를 인풋받으면 : "메달이 없습니다"
		  	===================================
		  2. Scanner 로 문자열 "gold", "silver", "bronze"
		  "gold" : "금메달입니다."
		  "silver" : "은메달입니다."
		  "bronze" : "동메달입니다."
		  그외 정수를 인풋받으면 : "메달이 없습니다"
		 */
		Scanner sc = new Scanner(System.in);
		
		int medal1;
		System.out.println("정수를 입력하세요>>>");
		medal1 = sc.nextInt();
		
		switch (medal1) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다");
			break;
		default: 
			System.out.println("메달이 없습니다.");
			//break; 
			
			
		} 
		
		System.out.println("==========================");
		
		//2.
		String medal2;
		System.out.println("메달을 입력하세요>>>");
		//String medal = sc.nextLine();
		medal2 = sc.next();
		
		switch (medal2) {
		case "gold": case "Gold" : case "GOLD" :
			System.out.println("금메달 입니다.");
			break;
		case "silver": case "Silver" : case "SILVER" :
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("동메달 입니다");
			break;
		default: 
			System.out.println("메달이 없습니다.");
			break; 
		}
		sc.close();
	}

}
