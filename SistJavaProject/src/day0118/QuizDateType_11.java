package day0118;

public class QuizDateType_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 메인 파라메타값으로 3과목의 점수를 읽어서 총점과 평균을 출력하시오
		 (소수점 이하 2자리)
		 변수는 java, jsp, spring, tot
		 java=88, jsp=77, spring=68
		 총점=233
		 평균=77.66
		 */
		
		//1.변수
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		
		//2.계산
		int tot=java+jsp+spring;
		
		//3.출력
		System.out.println(tot);
		
		double avg=tot/3.0;
		System.out.printf("java=%d,jsp=%d,spring=%d\n", java, jsp, spring);
		System.out.printf("총점: "+tot);
		System.out.printf("\n평균: %.2f\n", avg);
	}

}
