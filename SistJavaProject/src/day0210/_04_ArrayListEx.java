package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_ArrayListEx {

	//���� ���� ���� ������ �ٽɸ� ¤���� ������ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"���","�ĸ�����","�پ˸���","����","����"};
	
		//��ü���� ����, ����, �˻��Ҽ��ִ� �����̳� Ŭ���� (ArrayList)
		List<String> list = new ArrayList<String>();
		
		//str�� �����͸� ����Ʈ�� ��´�
		for (String s:str) {
			list.add(s);
		}
		
		System.out.println("���#1_for");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("���#2_for each");
		for (String s:list) {
			System.out.println(s);
		}
		
	}

}
