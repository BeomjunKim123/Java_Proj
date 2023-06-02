package chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;

class Student { //Map : key : 중복되면 안됨, equals(), hashCode()
	
	int stuID; //중복되면 안되도록 처리
	String stuName;
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		//key : Student, 
		Map <Student, String> linkMap = new LinkedHashMap();


		System.out.println(linkMap);
	}

}
