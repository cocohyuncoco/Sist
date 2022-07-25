package day0126;



public class ArraysEx_02 {

	public static void main(String[] args) {
		
		//배열선언
		//배열은 왜 클래스 범주에 끼느냐
		//기본형 배열은 객체로 인식
		
		//int[] arr=new int[3]; <-이렇게 많이쓴다. 메모리할당된다
		//int arr []=new int[3]; //할당만 하더라도 값을 주지 않더라도 0으로 초기화된다. 
		//선언과 동시에 초기값을 주기도 한다
		
		int [] arr,arr2; //<-배열 두개 선언
		arr=new int[3];
		arr2=new int[5];
		
		//배열에 값 넣기
		arr[0]=10;
		arr[1]=5;
		arr[2]=20;
		
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		
		System.out.println("arr 배열의 갯수:"+arr.length);
		
		//출력시 반복문을 이용해서 일괄적으로 출력(배열과 반복문은 땔래야 땔수가없다)
		
		System.out.println("***for문으로 일괄출력***");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("***for~each문으로 일괄출력***");
		for (int a:arr) { //for~each(같은자료형의 참조변수명:배열명) 참조변수 = 대체할변수 란 뜻
			System.out.println(a);
		}
		
		System.out.println("***for문으로 일괄출력2***");
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("***for~each문으로 일괄출력2***");
		for (int b:arr2) { //for~each(같은자료형의 참조변수명:배열명) 참조변수 = 대체할변수 란 뜻
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
