package chapter14.ex05;

class Aaa {
	void abc() throws ClassNotFoundException {
		
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//DB 연결시 사용 : 일반 예외 : 반드시 예외 처리 (1.자신이 직접 처리, 2. throws로 미룬다.)
		Class cls = Class.forName("java.lang.object1");
		System.out.println("존재하는 클래스 입니다.");
	}
}

public class Throws_Exception03 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Aaa a1 = new Aaa();
		
		
		try {
			
			a1.abc();
		} catch (ClassNotFoundException e) {
			System.out.println("예외가 발생됨 ===");
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료됨");

	}

}
