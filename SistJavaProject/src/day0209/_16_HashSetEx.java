package day0209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day0203.StudentInfoTest_10;

//얘네는 출력이 중요. 출력하기 위한거라고 보면된다. 그때그때 데이터를 삭제하고 수정하는게 가능할뿐
/*
 * <제네릭> 명시한 자료형(string, int..class..등)
 * <컬렉션> 자료구조 (set,vector, arraylist...)
 * 
 * **쓰는법** 							
 * (인터페이스 or 클래스명)<데이터형> 객체이름 = new 클래스명<데이터형>
 * 										(반드시클래스명)
 *  배열과 달리 가변적
 *  
 *  List: 순서가 중요할때, 인덱스위치를 알고있다, 중복가능
 *  Set: 유일성이 중요할때, 중복허용하지 않는다
 *  Map: 키(key),값(value)
 */

public class _16_HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<String>(); //set은 객체생성 안됨
		//Set 안에 String데이터를 담겠단 의미
		
		set1.add("사과");
		set1.add("바나나");
		set1.add("키위");
		set1.add("사과");//중복은 포함안됌
		set1.add("오렌지");
		set1.add("수박");
		
		System.out.println("데이터갯수:"+set1.size());
		System.out.println(set1);
		System.out.println("------------------------");
		/*
		 * Iterlator 인터페이스 - 꺼내서출력
		 * 컬렉션클래스에 대해서 Iterlator를 얻은 다음 반복, 주로 while문 돌려서 읽어온다
		 * 
		 */
		
		System.out.println("Set 얘네는 중복만 중요하다. 순서가 중요하면 List쓰기. 그래서 List도 많이쓰임");
		System.out.println("****출력#1****");
		
		for (String s:set1) {
			System.out.println(s);
			
		}
		System.out.println("------------------------");
		System.out.println("****출력#2****");		
		
		Iterator<String> iter=set1.iterator();
		
		while (iter.hasNext()) {//데이터가 더이상 없으면 false반환 
			
			//마지막 요소까지 돌려주겠다. 돌려줄게 있으면 true, 더이상 돌려줄게 없으면 false
			String s=iter.next();  
			System.out.println(s);
			
		}
		System.out.println("------------------------");
		System.out.println("****출력#3****");	
		
		Object[] ob=set1.toArray(); //오브젝트형 반환
		
		for (int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);			
		}
		
		System.out.println("------------------------");
		System.out.println("****출력#4****");	
		
		set1.clear(); //모든 데이터 삭제
		if (set1.isEmpty()) {
			System.out.println("set안에 데이터가 없다");
		}else {
			System.out.println("데이터가 있다");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
