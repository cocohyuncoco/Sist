package TEST;

import java.util.ArrayList;

class Tv {};
class Audio {};

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tv> list = new ArrayList<Tv>(); //TvŸ���� ��ü�� ���尡��
		list.add(new Tv());
		//���������� ���Ե� Ÿ��, �����ڿ� ���Ե� Ÿ���� ���ƾ��Ѵ�.
		
		ArrayList<Audio> list2 = new ArrayList<Audio>();
		list2.add(new Audio());
		
		Tv t = list.get(0); //list�� ù��° ��Ҹ� ������.
		
		//Ÿ�� ��ġ �ϴϱ� ����ȯ ���ʿ�
		//Tv t = (Tv)list.get(0); 
	}

}
