package chapter17.ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable<Aa> {
	String name;
	
	Aa (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " " + name + " ";
	}

	@Override
	public int compareTo(Aa o) {

		return (this.name.compareTo(o.name)); //오른차순으로 저장
	}
		
	
}

class Bb implements Comparable<Bb>{
	int userID;
	
	Bb (int userID) {
		this.userID = userID;
	}
	
	@Override
	public String toString() {
		return " " + userID + " ";
	}

	
	@Override
	public int compareTo(Bb o) {
		
		//오름차순 정렬
		if (this.userID < o.userID) {
			return -1;
		}else if (this.userID == o.userID) {
			return 0;
		}else {
			return 1;
		}
	
	}
}

public class Ex04 {

	public static void main(String[] args) {
		//두 클래스를 TreeSet에 저장시 정렬되어 출력되도록 구현
		
		Set<Aa> aaSet = new TreeSet();
		
		aaSet.add(new Aa("홍"));
		System.out.println(aaSet);
		
		System.out.println("===================");
		Set<Bb> bbSet = new TreeSet();
		
		bbSet.add(new Bb(111));
		System.out.println(bbSet);

	}

}


