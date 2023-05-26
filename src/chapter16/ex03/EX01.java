package chapter16.ex03;


class Tiger {
	Tiger() {}
	Tiger(String name) {
		this.name = name;
	}
	String name;
	//String name = "호랑이";
}
class Lion {
	Lion() {}
	Lion(String name) {
		this.name = name;
	}
	String name;
	//String name = "사자";
}
class Eagle {
	Eagle() {}
	Eagle(String name) {
		this.name = name;
	}
	String name;
	//String name = "독수리";
}

class Animal <T> {
	private Animal animal = new Animal();{
	
	//getter
		public Apple getAnimal()  {
			return animal;
		}
		
		//setter
		public void setAnimal(Animal animal) {
			this.animal = animal;
		}
		
	}
	
}

public class EX01 {
	
	public static void main(String[] args) {
		//Animal Generic 클래스에 Tiger, Lion, Eagle 클래스를 setter 주입하고, Getter로 가져와서 필드의 내용을 출력
		
		
		Animal1 a1 = new Animal1();
		

		g1.setAnimal(new Tiger("호랑이")); //setter를 사용해서 객체를 생성
		System.out.println((g1.getAnimal()).name);
		
		g1.seAnimal(new Animal("사자"));
		System.out.println((g1.getAnimal()).name);

		g1.setAnimal(new Animal("독수리"));
		System.out.println((g1.getAnimal()).name);
		
	}

}
