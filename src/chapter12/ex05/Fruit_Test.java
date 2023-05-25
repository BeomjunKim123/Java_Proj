package chapter12.ex05;

public class Fruit_Test {
	public static void main(String[] args) {
		//1. 인터페이스는 객체화가 불가능, 타입으로 지정해서 사용
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		
		//배열에 넣지 않고 출력
		f1.name();
		f1.eat();
		f1.color();
		
		f2.name();
		f2.eat();
		f2.color();
		
		//배열에 넣어서 출력
		Fruit[] arr = new Fruit[] {f1, f2};
		
		//For문을 사용해서 출력
		System.out.println("== For문을 사용해서 출력 ==");
		for (int i = 0; i < arr.length; i++) {
			arr[i].name();
			arr[i].eat();
			arr[i].color();
			System.out.println();
		}
		
		//Enhanced For 사용해서
		System.out.println("== Enhanced For 를 사용해서 출력 ==");
		for (Fruit k : arr) {
			k.name();
			k.eat();
			k.color();
			System.out.println();
		}
	}

}
