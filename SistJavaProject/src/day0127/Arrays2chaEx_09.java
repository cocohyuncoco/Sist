package day0127;

import java.util.Iterator;

public class Arrays2chaEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차열 배열 생성과 동시에 초기화
		
		int[][] arr= {
					{23,44},{11,22,33},{10,20,30,40}
					};
		
		System.out.println("총행갯수:"+arr.length);
		System.out.println("0번행의 열갯수:"+arr[0].length);
		System.out.println("1번행의 열갯수:"+arr[1].length);
		System.out.println("2번행의 열갯수:"+arr[2].length);
		
		//출력[0][0]=23 [0][1]=44
		
		for (int i=0;i<arr.length;i++)//행 
		{	
			for (int j=0;j<arr[i].length;j++)//열 
			{
				System.out.printf("[%d][%d]=%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
