package day0210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _06_MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "유재석");
		map.put("age", "23");
		map.put("addr", "서울시 노원구");
		map.put("name", "수지"); //같은 키값일 경우 먼저 데이터는 없어짐
		
		System.out.println("size: "+map.size());
		System.out.println("키값을 알면 정확하게 value값 얻는다");
		System.out.println("이름: "+map.get("name"));
		System.out.println("나이: "+map.get("age"));
		System.out.println("주소: "+map.get("addr"));
		
		System.out.println("혈액형: "+map.get("blood")); //map에 없는 키값은 null이 출력됨
		
		System.out.println("--------------------------");
		System.out.println("키값을 먼저 한번에 얻은후 값을 얻기");
		Set<String> keySet = map.keySet();
		
		System.out.println("방법#1");
		
		for (String key:keySet) {
			System.out.println(key+"-->"+map.get(key));
			
		}
		System.out.println("--------------------------");
		System.out.println("방법#2");
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.println(key+"-->"+map.get(key));
			
		}
		
	}

}
