package day0127;

import java.util.Iterator;
import java.util.Scanner;

public class QuizReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 스캐너로 숫자를 입력받아서 배열에 몇번쨰 있는지 출력
		 * 없을경우 없다고 출력..0을 입력시 종료
		 * 예)
		 * 입력값:11
		 * 11은 2번째에 있어요
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {6,11,45,66,78,23,88,77,100};
		int num, cnt=0;
		boolean flag;
		
		
		while (true) 
		{	cnt++;
			System.out.print("**입력값"+cnt+":");
			num=sc.nextInt();
			//0일시 종료
			if (num==0) 
			{
				System.out.println("**종료**");
				break; //while문을 빠져나가며 종료
			}
			flag=false; //반복문 안에서 찾으면 true로 변경
			//배열 개수만큼 반복해서 입력한 숫자 찾기
			for (int i=0;i<arr.length;i++)
			{
				if (num==arr[i]) 
				{ 
					flag=true;
					System.out.println("\t"+num+"은 "+(i+1)+"번째에 있어요");
				}
			}
			if (!flag) {//배열에 없는경우 flag는 여전히 false이다 
				flag=false;
				System.out.println("\t"+num+"은 없어요");
				}
		}//while문 끝
		
			
		
			
			
			
		
		
		
		
		
	}

}
