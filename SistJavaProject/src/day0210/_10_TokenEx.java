package day0210;

import java.util.Iterator;
import java.util.StringTokenizer;

public class _10_TokenEx {

	public static void main(String[] args) {
		// 문자열을 특정문자로 분리하는 방법
		
		String str ="red,blue,yellow,whilt,pink,purple,orange";
		
		System.out.println("String 객체에서 split 을 이용한 분리");
		String[] arr= str.split(",");
		System.out.println("총"+arr.length+"개");
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
			
		}

		System.out.println("StringTokenizer 를 이용한 분리");
		StringTokenizer st =new StringTokenizer(str,",");
		System.out.println("총 토큰수: "+st.countTokens());
		
		while (st.hasMoreTokens()) { //다음토큰 있으면 true, 없으면 false 반환
			System.out.println(st.nextToken()); //다음토큰열기
			
		}
		
	}

}
