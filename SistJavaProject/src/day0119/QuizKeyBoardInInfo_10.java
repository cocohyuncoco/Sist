package day0119;

import java.util.Calendar;
import java.util.Scanner;

public class QuizKeyBoardInInfo_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 응시자 이름: 김수현
		 * 출생년도: 1997
		 * 학과: 정보통신학과
		 * 소프트웨어 사전시험결과: 99
		 * 실전 응용테스트:66
		 * 
		 *  [시험결과]
		 *  응시자명: 김수현
		 *  나이:26세
		 *  시험결과 평균: 82.5
		 */
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		// 현재년도
		int curYear=cal.get(cal.YEAR);
		
		//변수선언
		String name,major;
		int myYear,scoreA,scoreB;
		int age;
		int tot;
		double avg;
		
		//입력에 관한 출력문..키보드입력
		System.out.print("응시자이름:");
		name=sc.nextLine();
		System.out.print("출생년도:");
		myYear=Integer.parseInt(sc.nextLine());
		//myYear=Integer.parseInt(sc.nextLine()); //엔터문제 발생 없애는방법
		System.out.print("학과:");
		major=sc.nextLine();		
		System.out.print("소프트웨어 사전시험결과:");
		scoreA=sc.nextInt();
		System.out.print("실전 응용테스트:");
		scoreB=sc.nextInt();
		
		//계산
		age=curYear-myYear+1;
		tot=scoreA+scoreB;
		avg=tot/2.0;
		
		//최종출력
		System.out.println("===============");
		System.out.println("[시험결과]");
		System.out.println("===============");
		System.out.println("응시자명:"+name);
		System.out.println("학과:"+major);
		System.out.println("나이:"+age);
		System.out.println("시험결과평균:"+avg+"점");
		
}

}
