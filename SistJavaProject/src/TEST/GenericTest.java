package TEST;

import java.util.ArrayList;

class Tv {};
class Audio {};

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
		list.add(new Tv());
		//참조변수에 대입된 타입, 생성자에 대입된 타입은 같아야한다.
		
		ArrayList<Audio> list2 = new ArrayList<Audio>();
		list2.add(new Audio());
		
		Tv t = list.get(0); //list의 첫번째 요소를 꺼낸다.
		
		//타입 일치 하니까 형변환 불필요
		//Tv t = (Tv)list.get(0); 
	}

}
