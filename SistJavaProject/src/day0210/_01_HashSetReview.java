package day0210;

import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSetReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"Java", "Beans", "Java", "XML"};
		
		//set�������̽��� ������ Ŭ����
		HashSet<String> hs1 = new HashSet<String>();
		
		HashSet<String> hs2 = new HashSet<String>();
		
		for (String n:str) {
			
			//�ߺ������ʹ� hs2�� �߰� (Java)
			if (!hs1.add(n)) {//hs1�� add���� ������ �̶� ����
				hs2.add(n);			
			}
		}
		System.out.println("hs1 :"+hs1);
		
		hs1.removeAll(hs2);//hs1���� hs2�� �ִ°� �� �����ϼ��� //�ߺ������� ����
		System.out.println("hs1 :"+hs1);
		System.out.println(hs2);
	}

}
