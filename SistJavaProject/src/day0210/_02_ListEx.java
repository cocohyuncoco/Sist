package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * 가장많이 사용하는 list 인터페이스
 * 
 * List인터페이스를 구현한 클래스가_Vector, ArrayList
 * -순차적으로 데이터가 들어간다
 * -중복데이터 허용한다
 * -생성자가 디폴트인 경우 기본할당 크기 10, 넘치면 2배씩 증가
 * -생성자가(5,3) -할당크기 5...증가시엔 3씩증가(5,8,11....)
 */
public class _02_ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이 중 편한대로 하기
		Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		//List<String> list = new ArrayList<String>();
		
		System.out.println("초기 할당 크기"+list.capacity()); //생성자가 디폴트인 경우 기본할당 10 출력
		System.out.println("초기 데이터갯수"+list.size()); //디폴트일땐 사이즈가 0
		System.out.println("---------------------------");
		
		list.add("사과");
		list.add("수박");
		list.add("딸기");
		list.add("사과");
		list.add("키위");
		list.add("바나나");
		//list.add(7); 제네릭 타입은 명시한 데이터만 담는다.
		System.out.println("할당크기"+list.capacity()); 
		System.out.println("데이터갯수"+list.size());
		System.out.println("---------------------------");
		
		//실제 출력방법은 for문 for이치 문 으로 자주쓴다
		System.out.println("출력방법#1");
		/*
		 * get(int index)-리스트내의 지정된 위치에 있는 요소를 돌려준다 (지정해준 데이터형으로)
		 *
		 */
		for (int i=0;i<list.size();i++) {
			String s = list.get(i);//값을 추출할때 쓰는 get메서드. 자주쓴다
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		//for이치로 많이한다
		System.out.println("출력방법#2");
		for (String s:list) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		//이터레이터로 출력
		System.out.println("출력방법#3");
		Iterator<String> iter=list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		System.out.println("---------------------------");
		//오브젝트 투 어레이
		System.out.println("출력방법#4");
		/*
		 * toArray(); 리스트 내의 모든요소를 순서대로 포함하고있는 배열에 넣어준다(반환형 Object[]) 
		 */
		Object[] ob = list.toArray(); //리스트를 배열 형태로 만들어서 오브젝트로 반환받기
		
		for (int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
			
		}
		
		
	}}


