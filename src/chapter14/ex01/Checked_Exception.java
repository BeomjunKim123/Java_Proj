package chapter14.ex01;

import java.io.FileInputStream;

public class Checked_Exception {

	public static void main(String[] args) {
		/*
		 	1. error vs Exception
		 		- error : H/W (CPU, RAM, HDD, LAN), OS (S/W), JVM <== 오류는 개발자가 제어가 불가능, Error
		 		- Exception : JVM위에서 자바 프레임에서 발생되는 문제들을 예외 (Exception)
		 			- 개발자가 제어가 가능한 부분
		 			- Exception 이 발생되면 그 시점에서 프로그램이 중지되어 버림.
		 			- Exception 이 발생되더라도 프로그램이 종료 되지 않도록 처리해야함.
		 			- Exception을 처리하는 방법은 2가지
		 				-throws ==> 예외를 호출하는 쪽에서 처리하도록 미루는것
		 				-try ~ catch ==> 내가 직접 예외를 처리함.
		 	2. Exception (예외)
		 		- 일반 예외 (checked Exception) : 컴파일러가 체크를 하고 이클립스에서 알려줌
		 		- 실행 예외 (Runtime (unchecked) Exception) : 컴파일러가 체크하지 않고, 실행시에 예외 발생
		 */
		
		//1. InterrupedExceptino : 인터럽트가 발생되었을때 예외
		//Thread.sleep(1000); //쓰레드를 1초동안 잠시 멈추어라

		//2.ClassNotFoundException : 특정 경로에 해당 클래스가 존재하지 않는 경우 발생 되느 예외
		//Class cls = Class.forName("java.lang.Object"); //DB의 driver 클래스를 로드할때 (oracle/ms-sql/mysql)
	
	
		//3. IOException : input, output에 대한 예외
		//InputStreamReader in = new InputStreamReader(System.in);
		
		//in.read(); //IO에 대한 오류
		
		//4. FileNotFoundException : 파일을 찾을 수 없을때 발생하는 오류
		//FileInputStream fis = new FileInputStream("text.txt");
	}

}
