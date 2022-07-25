package day0120;

import java.util.Scanner;

public class IfScanEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int score; //입력할 점수
		String msg; //조건에 따른 결과값
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		msg=score>=90?"상품권 100만원":score>=80?"상품권50만원":"다음 기회에...재시험";
//		System.out.println("점수= "+score);
//		System.out.println(msg);
		
		
		String grade;
		//학점
		if(score>=90) 
			grade="A";
		 else if(score>=80)
		 	 grade="B";
		 else if(score>=70)
		     grade="C";
		 else if(score>=60)
		     grade="D";
		  else
		 	grade="F";
		 
		System.out.println("점수= "+score);
		System.out.println("평가메시지: "+msg);
		System.out.println("학점: "+grade);
		
		
		
		
		
	}

}
