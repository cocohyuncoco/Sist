package day0126;

import java.util.Iterator;

public class RankReview_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *각 학생들의 점수에 대한 총점,평균,등수를 구하여 출력
		 *번호 이름 자바 오라클 총점 평균 등수
		 */
		
		String []name= {"강나리","곽경태","김은비","김종민","김주찬"};
		int[] java= {99,78,89,67,100};
		int[] oracle = {77,66,88,99,56};
		
		//tot,avg,rank는 5개 생성해 놓은후 계산은 for문으로
		int[] tot = new int[5];
		double[] avg = new double[5];
		int[] rank = new int[5];
		
		
		//총점평균 구하기
		for (int i=0;i<name.length;i++) {
			//총점
			tot[i]=java[i]+oracle[i];
			avg[i]=tot[i]/2.0;
			
		}
		
		//등수 구하기
		for (int i=0;i<name.length;i++) {
			rank[i]=1;
			for (int j=0;j<name.length;j++) {
				//반복하면서 나보다 큰 점수가 나오면 내 등수 1증가
				if (tot[i]<tot[j]) 
					rank[i]++;
			}
		}
		
		//출력하기
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균\t등수");
		
		for (int i=0;i<name.length;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
			
		}
	}

}
