package chapter17.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 	1.for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장
		 	2.Iterator를 사용해서 HashSet에 저장된 값을 출력
		 	3.Enhanced for문을 사용해서 출력
		 	4.HashSet에 저장된 값을  ===> 배열로 변환, 일반 for문을 사용해서 출력
		 
		 */
		
		//1. HashSet 선언후 객체 내부에 값입력
		Set<Integer> hSet1 = new HashSet();
		HashSet<Integer> hSet2 = new HashSet();
		
		
		for (int i = 1; i <= 100; i++) {
			hSet1.add(i);
		}
		
		System.out.println(hSet1);
		System.out.println("=======================================");
		
		// Iterator를 사용해서 출력
		Iterator<Integer> iterator = hSet1.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("=======================================");
		
		//Enhanced For문을 사용해서 출력
		for (Integer k : hSet1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=======================================");
		
		//배열로 변환후 일반 for문을 사용해서 출력
		Integer[] str = hSet1.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(str));
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		
	}

}
