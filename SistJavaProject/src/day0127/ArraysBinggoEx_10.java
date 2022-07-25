package day0127;

import java.util.Scanner;

public class ArraysBinggoEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] pz=new int[3][3];

		int binggo=0;

		while (true) 
		{
			System.out.println("**같은 숫자가 나오면 빙고!!**");

			//1~3사이의 난수발생(랜덤수발생)
			for (int i=0;i<pz.length;i++)//행 
			{
				for (int j=0;j<pz[i].length;j++)//열 
				{
					pz[i][j]=(int)(Math.random()*3)+1;
				}
			}
			//빙고초기화
			binggo=0;

			//출력
			for (int i=0;i<pz.length;i++) 
			{
				for (int j=0;j<pz[i].length;j++) 
				{
					System.out.printf("%4d",pz[i][j]);		
				}
				System.out.println();
			}		

			//빙고조건문
			//가로방향 3개, 세로방향 3개
			for (int i=0;i<pz.length;i++)
			{
				//가로방향 비교
				if (pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2]) 
					binggo++;
				//세로방향 비교
				if (pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i]) 
					binggo++;
			}

			//대각선 /
			if (pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0]) 
				binggo++;
			//대각선 \
			if (pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2]) 
				binggo++;

			//빙고출력
			if (binggo==0) 
				System.out.println("\t꽝!!!!");
			else
				System.out.println("\t빙고"+binggo+"개");

			System.out.println("엔터를 누르면 다음 난수가 발생합니다(종료:Q)");
			String ent = sc.nextLine();

			if (ent.equalsIgnoreCase("Q")) {
				System.out.println("****빙고게임 종료합니다****");
				break;
			}
		}
		System.out.println("-----------프로그램 종료-----------");
	}

}
