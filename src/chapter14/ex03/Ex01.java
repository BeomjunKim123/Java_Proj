package chapter14.ex03;

class H {
	int h;
}
class G extends H{
	int g;
}class A extends H{
	int a;
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		H h1 = new G();
		A a1 = (A)h1; //예외 발생
		
		String [] arr = new String[] {"안녕","오늘","날씨","맑음"};
		System.out.println(arr[4]); //예외 발생
		
		System.out.println("===1.예외처리 (각 각 처리)===");
		try {
			
		} catch (Exception e) {
			
		}
		
		System.out.println("===2.예외처리 (여러 catch로 예외 처리)===");
		System.out.println("===3.예외처리 (Exception으로 한꺼번에 처리)===");
		System.out.println("===4.예외처리 (catch 블락에세ㅓ 세밀하게 처리하고 그외는 Exception)===");

	}

}
