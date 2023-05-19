package chapter10.ex02;
//상속, 캐스팅
class Customer { //부모 클래스 : 고객의 정보를 담은 클래스
	String name; //고객 이름
	long customerID; //고객의 아이디
	int customerPoint; //

	
	void customInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + customerPoint);
	}
	
}

//자식 클래스 : GoldMember, SilverMember, BronzeMember <== int goldPoint : 10점/5점/3점, 메소드 goldInfo() 골드 회원입니다.

class GoldMember extends Customer{
	
	int goldPoint;
	void goldInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + goldPoint);
	}
}

class SilverMember extends Customer {
	
	int silverPoint;
	void silverInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + silverPoint);
	}
}

class BronzeMember extends Customer {
	
	int bronzePoint;
	void bronzeInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + bronzePoint);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 각 객체를 생성해서 부모클래스의 필드와 메소드 접근 가능한지 확인후 업캐스팅 <==> 다운캐스팅

		//1.Customer
		Customer c1 = new Customer();
		//c1 : customer
		
		//2.goldmember
		GoldMember g1 = new GoldMember();
		//g1 : goldmember / customer 타입을 모두 가지고
		g1.name = "골드 멤버";
		g1.customerID = 1111;
		g1.goldPoint = 10;
		
		//3.SilverMember
		SilverMember s1 = new SilverMember();
		s1.name = "실버 멤버";
		s1.customerID = 2222;
		s1.silverPoint = 5;
		
		//4.bronzeMember
		BronzeMember b1 = new BronzeMember();
		b1.name = "브론즈 멤버";
		b1.customerID = 3333;
		b1.bronzePoint = 3;
		
		System.out.println("==================================");
		
		
		//c1, g1(골드,커스토머), s1(실버,커스토머), b1(브론즈,커스토머)을 customer 타입으로 배열에 저장
		
		//객체를 배열 arr에 넣을 : upCasting됨
		//배열 arr에 저장된 모든 객체는 Customer 타입을 내포하고 있고, Customer타입으로
			//upCasting 되어 들어가 있음
		
		//arr에 들어가 있는 객체는 customer 타입
		Customer[] arr = new Customer[] {c1, g1, s1, b1};
		
		//배열에 저장된 객체를 가지고온다.
		Customer cc1 = arr[0];  //Animal
		Customer cc2 = arr[1];	//Animal / gold
		Customer cc3 = arr[2];	//Animal / silver
		Customer cc4 = arr[3];	//Animal / bronzes
		
		//
		cc1.customInfo();
		
		
		// 다운캐스팅
		GoldMember gg1 = (GoldMember) cc2;
		gg1.goldInfo();
		
		SilverMember ss1 = (SilverMember) cc3;
		ss1.silverInfo();
		
		BronzeMember bb1 = (BronzeMember) cc4;
		bb1.bronzeInfo();
		
		System.out.println("====================================");

		//객체 생성시 타입을 지정 ;
		
		//1. Customer 객체 생성시 타입 지정
		Customer cus1 = new Customer();
		
		//2. GoldMember 객체 생성시 타입 지정 : Customer / GoldMember
		Customer cus2 = new GoldMember();
			//cus2 : GoldMember, Custommer를 내포하고 있고, Customer로 지정
			cus2.name = "고객 이름"; //Customer만 접근 가능
			
			GoldMember gm1 = (GoldMember) cus2;
			gm1.goldPoint = 10;
			gm1.goldInfo();
		
		//2. GoldMember 객체 생성시 타입을 GoldMember로 지정
		GoldMember gm2 = new GoldMember();
		
		//3. silvermember 객체화 하면서 custom 타입으로 지정
		Customer cus3 = new SilverMember(); //cus3 : SilverMember / Customer 모두 가지고 있고 Customer로 타입이 지정
		
		SilverMember sil1 = (SilverMember) cus3;
		
		//4. silverMember 객체화 하면서 SilverMember 타입으로 지정 : 
		SilverMember sil3 = new SilverMember();
			//sil3 : SilverMember / Customer
		
		System.out.println("====================================");
		
		Customer ccc1 = new GoldMember(); //ccc1 : gold/customer
		Customer ccc2 = new SilverMember(); //ccc2 : silver/customer
		Customer ccc3 = new BronzeMember(); //ccc3 : bronze/customer
		
		//자식 클래스를 부모 타입으로 객체화 해서 배열에 저장
		Customer [] arr2 = new Customer[] {ccc1, ccc2, ccc3};
		
		//각 배열의 방의 값을 끄집어 내면서 다운 캐스팅
		GoldMember gm11 = (GoldMember) arr2[0];
		SilverMember sil11 = (SilverMember) arr2[1];
		BronzeMember brol1 = (BronzeMember) arr2[2];
	}
	
}




