package chapter02.ex05;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		 타입 캐스팅 (Type Casting) : 정수 => 실수, 실수 => 정수
		 	-- 낮은 자료형 => 높은 자료형
		 		byte => short => int => long => float => double
		 		
		 	-- 업캐스팅 : 자동으로 변환, 
		 		낮은 자료형에서 높은 자료형으로 변환
		 	-- 다운캐스팅 : 자동으로 변환이 안됨, 수동으로 명시가 필요함.
		 		높은자료형에서 낮은 자료형으로 변환
		 */
		
		//1. 캐스팅 방법
		
		//int val1 = 4.3; //오류 발생 val1 : int 이므로 실수를 넣으면 오류발생
		int val2 = (int) 4.3; //실수를 정수형으로 바꾸겠다, 다운 캐스팅 : 실수 4.3을 정수형으로
								//다운 캐스팅 해서 변수에 할당, val2 : 4
		
		System.out.println(val2); //4
		
		double val3 = 3; // 업캐스팅 : 자동으로 작동됨
		System.out.println(val3);
		
		// 다운캐스팅 필요함. (명시해야함)
		int val4 = (int)5.8;
		long val5 = (long)10.0000344;
		System.out.println(val4); //ctrl + alt + 화살표 : 한라인 복사
		System.out.println(val5);
		
		// 업캐스팅 자동으로 됨. (명시안해도됨)
		
		float val6 = 5;
		double val7 = 6;
		
		System.out.println(val6);
		System.out.println(val7);
	}

}
