package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _03_VectorEx {

	//출력용 메서드
	public static void write(String title,List<String> list) {
		System.out.println("--------------------");
		System.out.println("**"+title+"**");
		for (int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"사과","바나나","오렌지","딸기"};
		
		//배열의 데이터를 리스트에 넣기
		
		//List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		
		for (String s:data) {
			list.add(s);
		}
		
		//data추가 후 출력
		for (int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
			
		}
		
		write("초기데이터 출력", list);
		
		System.out.println("1번 인덱스 삭제하기");
		list.remove(1);
		write("1번 삭제후 데이터 출력", list);
		
		System.out.println("수박 추가하기");
		list.add("수박");
		write("수박 추가후 데이터 출력", list);
		
		list.set(0, "임현정");
		write("0번을 바꾸기", list);
		
		
		list.clear();
		write("전체삭제하기", list);
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
