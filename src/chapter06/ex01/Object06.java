package chapter06.ex01;

class Student2 {
	//기본생성자
	
	//필드
	String sName; //학생 이름
	int sAge; //학생나이
	String sAddr; //학생주소
	String sEmail; //학생메일주소
	
	//메소드 : 필드의 내용을 출력하는 메소드
	public void print() {
		System.out.println("이름 : " + sName);
		System.out.println("나이 : " + sAge);
		System.out.println("주소 : " + sAddr);
		System.out.println("메일주소 : " + sEmail);
	
	}
}

public class Object06 {

	public static void main(String[] args) {
		//kim 객체 : 김길동/20/서울/aaa@aaa.com
		//lee 객체 : 이순신/30/부산/bbb@bbb.com
		//hong 객체 : 홍길동/45/광주/ccc@ccc.com
		
		//각 객체의 필드의 값 읿력후, 배열에 넣어서 저장후 끄집어 내어서 다시 출력....
		
		//1. 객체 생성
		Student2 kim = new Student2();
		
		//2. 각 객체의 필드값 입력
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";

		kim.print();
		
		System.out.println("==================================");
		
		Student2 lee = new Student2();
		
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddr = "부산";
		lee.sEmail = "bbb@bbb.com";
		
		lee.print();
		
		System.out.println("==================================");
		
		Student2 hong = new Student2();
		
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		hong.print();
		
		System.out.println("==================================");
		System.out.println("=====객체를 배열에 저장============");
		
		Student2[] arr1 = new Student2[3];
		
		arr1[0] = kim; 
		arr1[1] = lee; 
		arr1[2] = hong;
		
		//System.out.println(kim);
		//System.out.println(lee);
		//System.out.println(hong);
		
		Student2 out1 = arr1[0];
		Student2 out2 = arr1[1];
		Student2 out3 = arr1[2];
		
		out1.print();
		System.out.println("==================================");
		out2.print();
		System.out.println("==================================");
		out3.print();
		
		

	}

}
