package day0127;

import java.util.Arrays;

public class ArraysTempEx_03 {

	public static void main(String[] args) {
		// 거꾸로 데이터를 바꾸어 출력
		
		int[] arr= {5,7,3,9,12,45,76,89,10};
		
	/*	for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//데이터를 거꾸로 바꿔 보기
		
		for (int i=0;i<arr.length/2;i++) //배열의 반으로 나눈 만큼만 반복 
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("거꾸로 출력 데이터");
		for (int i=0;i<arr.length;i++) //배열의 반으로 나눈 만큼만 반복 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();*/
		
	
		//오름차순 정렬(중첩for)
		//기준 데이터는 0부터 끝에서 2번째 까지
		for (int i=0;i<arr.length-1;i++) 
		{
			//비교데이터는 기준 다음 값 부터 끝까지
			for (int j=i+1;j<arr.length;j++) 
			{
				//조건문에 따른 자리바꿈
				if (arr[i]>arr[j]) //조건문은 바꿔야할 경우의 조건을 만들어야 한다
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("오름차순 출력 데이터");
		for (int i=0;i<arr.length;i++)  
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(); 
		
		//Arrays.sort(arr); //배열arr을 오름차순 정렬한다
		//System.out.println(arr.toString()); //주소값 반환되므로 Arrays이용한다
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.s(arr)); 
		
//		System.out.println("오름차순 출력 데이터");
//		for (int i=0;i<arr.length;i++)  
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
	}

}
