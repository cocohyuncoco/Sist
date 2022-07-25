package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_ArrayListEx {

	//어제 오늘 많이 했지만 핵심만 짚으면 이정도 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"장미","후리지아","다알리아","백합","수국"};
	
		//객체들을 삽입, 삭제, 검색할수있는 컨테이너 클래스 (ArrayList)
		List<String> list = new ArrayList<String>();
		
		//str의 데이터를 리스트에 담는다
		for (String s:str) {
			list.add(s);
		}
		
		System.out.println("출력#1_for");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("출력#2_for each");
		for (String s:list) {
			System.out.println(s);
		}
		
	}

}
