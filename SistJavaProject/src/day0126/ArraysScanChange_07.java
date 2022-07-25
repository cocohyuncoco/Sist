package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysScanChange_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 입력할 학생의 인원수가 몇명인지를 표시 후 학생의 이름과 점수를 입력후 출력
		 * 합계와 평균도 구해보자
		 */
		
		int inwon;
		String[] name;
		int[] score;
		int[] rank;
		int tot=0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하시오");
		inwon = Integer.parseInt(sc.nextLine()); //뒤에 이름 문자열이 옴으로
		
		//인원수만 이름,점수의 배열 할당
		name=new String[inwon];
		score=new int[inwon];
		rank=new int[inwon];
		
		//인원수 만큼 데이터를 입력
		for (int i=0;i<inwon;i++) {
			System.out.println(i+"번째 학생명");
			name[i] = sc.nextLine();
			System.out.println(i+"번째 학생점수");
			score[i] = Integer.parseInt(sc.nextLine());
			//총점
			tot+=score[i];	
		}
		
		//등수구하기 로직(다중for문)
		for (int i=0;i<inwon;i++) {
			rank[i]=1;
			for (int j=0;j<inwon;j++) {
				//비교되는 대상이 점수가 더 높으면 i번지등수 1증가
				if (score[i]<score[j]) {
					 rank[i]++;		
				}
			}
		}
		
		
		//평균
		avg=(double)tot/inwon;
		
		//출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("-----------------------------");
		
		for (int i=0;i<inwon;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
			
		}
		System.out.println("-----------------------------");
		System.out.println("총점\t\t"+tot);
		System.out.println("평균\t\t"+avg);
		
		
		
		
		
		
	}

}
