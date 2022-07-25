package day0126;

import java.util.Iterator;

public class ArraysMaxMinEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {5,45,87,123,56,77,99,545};
		System.out.println("data갯수 "+data.length);
		
		int max=data[0]; //배열에서는 첫데이터를 무조건 최대값에 저장
		int min=data[0];
		
		//두번째 데이터 부터 끝까지 max와 비교
		for (int i=0;i<data.length;i++) {
			if (max<data[i]) 
				max=data[i];
			if (min>data[i]) 
				min=data[i];
		}
		System.out.println("data 최대값 "+max);
		System.out.println("data 최소값 "+min);
		
	}

}
