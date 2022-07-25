package day0124;

import java.util.Iterator;

public class ForGuguBreak_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2~9단까지 출력하되 2*4=8...9*4=36
		//각각 4까지만 출력되게 하시오...breck를 이용하시오
		
		for (int dan=2;dan<=9;dan++)
		{
			for (int j=1;j<=9;j++) 
			{
				if (j==5) 
					break; //가장 가까운 반복문 빠져나가기
					System.out.println(dan+"X"+j+"="+dan*j);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
