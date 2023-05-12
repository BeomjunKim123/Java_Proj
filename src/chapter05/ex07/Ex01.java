package chapter05.ex07;

public class Ex01 {
	public static void main(String[] args) {
		/*
		   main 메소드 args로 다음의 값을 넘깁니다.
		   
		   국어 60 영어 70 수학 80 음악 90 과학 70
		   
		   각 과목의 합계 :
		   각 과목의 평균 :
		 */
		
		/*
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		
		System.out.println("=======================");
		
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		int cc = Integer.parseInt(args[2]);
		int dd = Integer.parseInt(args[3]);
		int ee = Integer.parseInt(args[4]);
		
		int avg = (aa + bb + cc + dd + ee) / 5;
		
		System.out.println("각 과목의 합계는 : ");
		System.out.println(aa + bb + cc + dd + ee);
		
		System.out.println("=======================");
		
		System.out.println("각 과목의 평균은 : ");
		System.out.println(avg);
		*/
		
		//1. for문을 사용해서 배열로 들어오는 전체 내욜을 출력
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + " "); //String 각 방의 내용을 출력
		}
		System.out.println();
		System.out.println("==For 문을 사용해서 각 과목의 점수를 int형으로 변환후 출력 : 합계 : 평균 ===");
		
		int count = 0 ;
		int sum = 0;
		
		
		for ( int i = 0;  i < args.length; i++) { 
		//	if (i == 1 || i == 3 || i == 5 || i == 7 || i ==9) {
			if (i % 2 != 0) { //i가 홀수일때만 실행
				sum += Integer.parseInt(args[i]); //sum = sum + 정수
				count++;
			}
		
    		}
		System.out.printf("모든 과목의 합계는 %d 이고 평균은 : %.2f 입니다.",  sum, ((double)sum/count ));
		
		}
	
	}


