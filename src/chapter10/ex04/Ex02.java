package chapter10.ex04;

class Car{
	String companyName = "현대 자동차";
	int carYear; //생산년도.
}
class Hcar extends Car {
	
	//
	String carName; //자동차 모델 (에쿠스, 제네시스, 아반떼, 봉고)
	int maxSpeed; //최대 speed
	int oilLiter; //각 차의 오일이 최대 몇 리터
	
}
class BMW extends Car {
	
	
}

public class Ex02 {
	//
	Car[] arr = null;
	
	void carInfo (Car c1, Car c2, Car c3, Car c4) { 
		//현대 자동차 객체를 인풋으로 받아서 arr 배열 변수에 저장
		//현대 자동차의 배열에 저장된 최대스피드의 평균을 출력
		//현대 자동차의 배열에 저장된 오일의 합을 출력
		
		arr = new Car[] {c1, c2, c3, c4};
		avgMaxSpeed(arr);
		sumOil(arr);
		
		
	}
	void avgMaxSpeed (Car[] arr) {
		
	}
	int sumOil (Car[] arr) {
		int sum = 0;
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		//현대자동차의 객체를 생성해서 필드의 값 입력
								//연식 / 차명 / 최대스피드 / 오일 용량
		Hcar h1 = new Hcar();  // 2000 / 에쿠스 / 330 / 60
		Hcar h2 = new Hcar();  // 2010 / 제네시스 / 300 / 50
		Hcar h3 = new Hcar();  // 2022 / 그랜저 / 250 / 55
		Hcar h4 = new Hcar();  // 2023 / 아반떼 / 200 / 40
		
		h1.carYear = 2000;
		h1.carName = "에쿠스";
		h1.maxSpeed = 330;
		h1.oilLiter = 60;
		
		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;

		h3.carYear = 2022;
		h3.carName = "그랜저";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;
		
		h4.carYear = 2023;
		h4.carName = "아반떼";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;
		
		Ex02 e1 = new Ex02();
		e1.carInfo(h1, h2, h3, h4);
	}

}
