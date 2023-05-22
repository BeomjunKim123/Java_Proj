package chapter10.ex03;

class Customer {
	
	void memberInfo() {
		System.out.println("회원님은 기본 회원님 입니다.");
	}
}

class Gold extends Customer {
	@Override
	void memberInfo() {
		System.out.println("골드");
	}
}

class Silver extends Customer {
	@Override
	void memberInfo() {
		System.out.println("실버");
	}
}

class Bronze extends Customer {
	@Override
	void memberInfo() {
		System.out.println("브론즈");
	}
}


public class Ex03 {
	public static void main(String[] args) {
		
		//자식을 객체화해서 부모 타입으로 지정
		//부모의 메소드 호출시 오버라이딩된 메소드 출력
		//for / Enhance For문에 넣어서 출력
		
		Customer c1 = new Gold();
		Customer c2 = new Silver();
		Customer c3 = new Bronze();
		
		c1.memberInfo();
		c2.memberInfo();
		c3.memberInfo();
		
		System.out.println("====배열에 저장후 한번에 출력 ====");
		
		Customer[] arr = new Customer[] {c1, c2, c3};

		for (int i = 0; i < arr.length; i++) {
			
			//Animal 타입의 run이 호출됨
			arr[i].memberInfo();
			}
		
			//Enhanced For문을 사용해서 출력
			System.out.println("======Enhanced for문을 사용해서 출력======");
				
			for (Customer k : arr) {
			k.memberInfo();
		}
		
		
	}

}
