package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysIntSearchEx_08 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력하여 그 숫자가 몇번째 있는지 찾는
		 * 0을 입력시 종료할것!! 
		 */
		
		int[] data= {11,22,33,44,55,66,77,88,99,111,222};
		
		Scanner sc = new Scanner(System.in);
		boolean flag; //있는지 없는지를 알려줄 변수
		int su; //입력할수
		
		while (true) {
			System.out.println("***검색할 숫자를 입력해 주세요***");
			su=sc.nextInt();
			//종료
			if (su==0) {
				System.out.println("검색종료");
				break;
			}
			
				flag=false; //찾으면 true로 변경;
			
			//값 찾기
		   for (int i=0;i<data.length;i++) {
			//찾는 조건문
			   if (su==data[i]) {
				flag=true;
				System.out.println((i+1)+" 번째에 있는 수 입니다. 정답");
			   	}
			   }
			   
			   if (!flag)  //flag==false
				   System.out.println(su+"는 데이터에 없습니다");
				
		}
	 }

	
		

}

