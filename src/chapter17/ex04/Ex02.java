package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Student {
	
	int stuID; //식별자 : 
	String stuName;
	String stuPhone;
	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.stuID ==((Student)obj).stuID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		 
		return Objects.hash(stuID);
	}
	
	@Override
	public String toString() {
		return stuID + " " + stuName + " " + stuPhone;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Student> hset = new HashSet();
		
		//학생 객체 5개 생성해서 set에 넣을경우 stuID 필드에 중복된 값을 넣지 못하도록 설정
		// stuID필드의 equals() 재정의, hashCode() 재정의
		
		Student s1 = new Student(111, "홍길동", "아이폰");
		Student s2 = new Student(222, "박명수", "갤럭시");
		Student s3 = new Student(333, "유재석", "옵티머스");
		Student s4 = new Student(111, "고길동", "베가");
		Student s5 = new Student(111, "홍길순", "롤리팝");
		
		//Set에 값을 할당 : hset
		hset.add(s1); hset.add(s1); hset.add(s1); hset.add(s1); hset.add(s1); 
		
		System.out.println(hset.size());
		
		System.out.println("===Set에 저장된 값을 출력 : Iterator 사용 ===");
		Iterator<Student> ir = hset.iterator();
		while(ir.hasNext()) {
			
			Student student = ir.next();
			
			System.out.println(student);
			//System.out.println(ir.next().stuID);
		}
		
		System.out.println("===Set에 저장된 값을 출력 : Enhance For 사용 ===");
		for (Student K : hset ) {
			
		}

	}

}
