package day0126;

import java.util.Iterator;

public class ArraysStringEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str;
		str=new String[4];
		
		str[0]="홍길동";
		str[1]="김동규";
		str[2]="임현정";
		str[3]="김림보";
		//초기화 안해주면 null
		
		System.out.println("출력1_for");
		for (int i=0;i<str.length;i++) {
			System.out.println((i+1)+":"+str[i]);
			
		}
		
		System.out.println("출력2_for~each");
		for (String s:str) {
			System.out.println(s);
			
		}
		
		
	}

}
