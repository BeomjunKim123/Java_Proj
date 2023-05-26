package chapter16.ex02;

class Tiger {
	String name = "호랑이";
}
class Lion {
	String name = "사자";
}
class Eagle {
	String name = "독수리";
}

class Animal {
	
	private Object obj;
	
	//getter : 필드의 값을 리턴
	public Object getObj() {
		return obj;
	}
		
	//setter : 필드의 값을 할당
	public void setObj (Object obj) { 
		this.obj = obj;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		/*
		 	Animal 클래스에 Tiger, Lion, Eagle 객체를 setter 주입하고 ===> Object 타입
		 	getter 사용해서 가져와서 name 필드를 출력
		 */

	}

}
