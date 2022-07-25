package day0127;

import java.util.Iterator;

public class ArraysSortString_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data= {"차동현","류슬영","이경룡","이용기","신지환","원연욱","장수빈"};
		
		System.out.println("**정렬 전 출력**");
		
		for (int i=0;i<data.length;i++) 
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		//System.out.println("a"+compareTo("b")); -1
		//같으면 0, i>j 양수반환 i<j 음수반환
		
		
		//오름차순 출력
		//기준데이터: 0부터 끝에서 2번째까지
		for (int i=0;i<data.length-1;i++) 
		{	
			//비교하는 데이터는 기준 다음값부터 끝까지
			for (int j=i+1;j<data.length;j++) 
			{
				//순서를 바꿀 조건문
				if (data[i].compareTo(data[j])>0) 
				{
					String temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println("**정렬 후 출력**");
		
		for (int i=0;i<data.length;i++) 
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		
	}

}
