package chapter17.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Test {

	public static void main(String[] args) {
		//1. Car 타입의 객체 5개 생성후
		Car c1 = new Car("현대자동차", "그랜저", "검은색", 300);
		Car c2 = new Car("현대자동차", "에쿠스", "흰색", 300);
		Car c3 = new Car("쌍용자동차", "티볼리", "은색", 300);
		Car c4 = new Car("삼성자동차", "xm5", "빨간색", 300);
		Car c5 = new Car("테슬라", "테슬라차", "파란색", 300);

		//2. ArrayList에 저장
		List<Car> aL = new ArrayList<>();
		aL.add(c1);
		aL.add(c2);
		aL.add(c3);
		aL.add(c4);
		aL.add(c5);
		System.out.println(aL.size());
		
		//3. Vector에 저장
		List<Car> vL = new Vector<>();
		vL.add(c1);
		vL.add(c2);
		vL.add(c3);
		vL.add(c4);
		vL.add(c5);
		System.out.println(vL.size());
		
		//4. LinkedList에 저장
		List<Car> lL = new LinkedList<>();
		lL.add(c1);
		lL.add(c2);
		lL.add(c3);
		lL.add(c4);
		lL.add(c5);
		System.out.println(lL.size());
		
		//5. 리스트에 저장된 Car 객체를 가지고 와서 출력 FOR 문으로 출력
		System.out.println("===For문을 사용해서 ArrayList에 저장된 값을 출력 ===");
		for (int i = 0; i < aL.size(); i++) {
			System.out.println(aL.get(i)); //c1, c2, c3, c4, c5
		}
		System.out.println();
		
		//6. 리스트에 저장된 Car 객체를 가지고 와서 출력 Enhanced FOR문으로 출력
		System.out.println("=== Enhanced For 문을 사용하여 출력 ===");
		for (Car k : aL) {
			System.out.println(k);
		}
		
		

	}

}
