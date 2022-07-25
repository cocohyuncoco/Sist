package day0119;

import java.util.Scanner;

public class ScanScoreTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 학생명-> 홍길동
		 * 국어, 수학, 영어 점수를 차례로 입력하시오
		 * 88
		 * 100
		 * 55
		 * =================
		 * 학생명:홍길동
		 * 국어:88점
		 * 수학:100점
		 * 영어:55점
		 * 평균:81.00점
		 * 
		 *  변수: name, kor, mat, eng, tot, avg
		 */	
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int kor, mat, eng;
		int tot;
		double avg;
		
		System.out.print("학생명==>");
		name=sc.nextLine();
		System.out.print("국어,수학,영어 점수를 차례로 입력하시오");
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		
		avg=tot/3.0;
		
		System.out.println("==============");
		System.out.println("학생명: "+name);
		System.out.println("국어 :"+kor+"점");
		System.out.println("수학 :"+mat+"점");
		System.out.println("영어 :"+eng+"점");
		System.out.printf("평균:%.2f",avg);
		
		
	}

}
