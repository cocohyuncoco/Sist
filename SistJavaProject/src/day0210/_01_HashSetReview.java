package day0210;

import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSetReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"Java", "Beans", "Java", "XML"};
		
		//set인터페이스를 구현한 클래스
		HashSet<String> hs1 = new HashSet<String>();
		
		HashSet<String> hs2 = new HashSet<String>();
		
		for (String n:str) {
			
			//중복데이터는 hs2에 추가 (Java)
			if (!hs1.add(n)) {//hs1에 add하지 않은것 이란 조건
				hs2.add(n);			
			}
		}
		System.out.println("hs1 :"+hs1);
		
		hs1.removeAll(hs2);//hs1에서 hs2에 있는걸 다 삭제하세요 //중복데이터 삭제
		System.out.println("hs1 :"+hs1);
		System.out.println(hs2);
	}

}
