package chapter07.ex04;

class Car {
	//각 생성자에서 값을 할당할때 초기값을 로드 각 필드의 기본값을 할당
	// this() 를 사용해서 인풋 받은 값을 넣어서 출력
	
	//기본 생성자에서 초기값 할당
	
	Car () {
		company = "회사명 없음";
		carName = "차명 없음";
		carColor = "차색 등록안됨";
		carDoor = 0;
		carWeight = 0.0;
	}
	
	//매개변수가 1개 인풋
	Car(String company) {
		this();
		this.company = company;
	}
	
	//2개
	Car(String company, String carName) {
		this(company);
		this.carName = carName;
	}
	
	//3개
	
	String company;
	String carName;
	String carColor;
	int carDoor;
	double carWeight;
	
	//필드의 값을 모든값을 출력
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", carDoor=" + carDoor
				+ ", carWeight=" + carWeight + "]";
	}
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		//Car 객체 생성
		/*
		Car c1 = new car();
		Car c2 = new car();
		Car c3 = new car();
		Car c4 = new car();
		Car c5 = new car();
		*/
	}
}
