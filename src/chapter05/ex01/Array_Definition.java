package chapter05.ex01;

public class Array_Definition {
	public static void main(String[] args) {
		/*
		 	자료형 : 자바는 변수명 앞에 반드시 자료형이 선언되어야 한다.
		 		- 기본 자료형 (8) : boolean, byte, short, int, long, float, double
		 			- 변수명과 값이 Stack 메모리 영역에 저장됨
		 			- 사용전에 반드시 초기값이 할당 되어 있어야 한다.
		 			- 첫자가 소문자로 되어 있다.
		 			-  == <== Stack 영역의 값을 비교하는 연산자.
		 		- 참조 자료형 : 배열/열거/객체(class)/인터페이스
		 			- 무한대로 만들수 있다.
		 			- 변수명 (Stack) : Heap 영역의 참조 주소 값이 변수명에 저장되어있다.
		 			- 값 (Heap) : 
		 			- 참조 자료형에서 == <== Stack의 값을 비교ㅣ (Heap의 주소를 비교)
		 				Heap의 값을 비교 할때는 equals() 를 사용해야 한다.
		 			- Heap 영역은 반드시 초기값이 들어 있어야 한다.
		 			- 변수선언만 하고 초기 값을 넣지 않더라도 강제로 자동으로 할당이 됨.
		 			- boolean (false), 정수 [byte, short, int, long] : 0(자동으로들어감), 
		 				실수 [float, double] :0.0(자동으로들어감)
		 				
		 		- 배열 : 하나의 배열 변수에 여러개의 값을 할당할 수 있다.
		 			- 반드시 방의 개수를 선언해야 한다.
		 			- 한번 방의 개수가 지정되면 늘리거나 줄일 수 없다.
		 			- 배열의 방번호 : index [0, 1, 2, 3, 4]
		 			- 배열의 방의 개수 : 배열변ㅅ누명.length()
		 			- 초기값을 설정 하지 않더라도 자동으로 기본 값이 들어감.
		 */
		
		//1. 변수 선언 : 하나의 값만 저장됨. 변수에 다른 값을 저장할 수 있다.
		int a = 10;
		
		int b;
		b = 20;
		b = 50;
		
		//2. 배열 선언 동시에 방의 크기를 지정
		int[] arr1 = new int[3];
			// int[] : 배열변수에 저장할 자료형, arr1 : 배열 변수명,
			// new : 변수의 값을 Heap 영역에 저장하겠다.
			// int[3] : 배열의 방의 개수 : 3개로 지정
				//index (0,1,2)
		
		//3. 배열의 기본 값을 출력
			System.out.println(arr1[0]); //arr1 배열변수의 0번방의 값을 출력
			System.out.println(arr1[1]); //arr1 배열변수의 1번방의 값을 출력
			System.out.println(arr1[2]); //arr1 배열변수의 2번방의 값을 출력
		//	System.out.println(arr1[3]); //arr1 배열변수의 3번방의 값을 출력
			
			System.out.println("========================");
		//4. 배열 방의 값을 저장
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			
			//배열 방의 값을 출력
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
			
			System.out.println("========================");
			
			double[] arr2; //배열 변수 선언
			arr2 = new double[6]; //선언후 나중에 방 크기 지정, index(방번호) : 0,1,2,3,4,5
			
			System.out.println(arr2[0]); //0,0
		
			System.out.println("========================");
			//배열 변수 arr2 의 각 방에 실수를 저장
			arr2[0] = 10.0;
			arr2[1] = 20.0;
			arr2[2] = 30.0;
			arr2[3] = 40.0;
			arr2[4] = 50.0;
			arr2[5] = 60.0;
//			arr2[6] = 60.0;	//arrayindexOutofBound Exception (배열의 방번호를 알수 없다)
								//컴파일 오류 : 이클립스에서 자동으로 감지
								//실행 오류 : 
			
			//값을 출력
			System.out.println("arr2의 0번째 방의 값 : " + arr2[0] );
			System.out.println("arr2의 1번째 방의 값 : " + arr2[1] );
			System.out.println("arr2의 2번째 방의 값 : " + arr2[2] );
			System.out.println("arr2의 3번째 방의 값 : " + arr2[3] );
			System.out.println("arr2의 4번째 방의 값 : " + arr2[4] );
			System.out.println("arr2의 5번째 방의 값 : " + arr2[5] );
//			System.out.println("arr2의 6번째 방의 값 : " + arr2[6] );
			
			System.out.println("========================");
			//For문을 사용해서 배열에 값을 할당 후 출력하기
			
			//1부터 100까지의 배열 변수에 저장후
			int[] arr3 = new int[100];
			
			System.out.println(arr3.length); //배열 방의 개수를 출력
			
			//for문을 사용해서 배열 변수의 값을 할당.
				for (int i = 0; i < 100; i++ ) {
					arr3[i] = i + 1; //배열의 각방에 1,2,3,4,5
				}
				
			// for문을 사용해서 배열의 각 방에 저장된 값을 출력
				for (int i = 0; i < 100; i++) {
					System.out.println("arr3 변수의 [" + i + "] 번째 방의 값을 출력 : " + arr3[i]);
				}
			
	}

}
