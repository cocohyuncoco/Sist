package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _03_VectorEx {

	//��¿� �޼���
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

		String[] data = {"���","�ٳ���","������","����"};
		
		//�迭�� �����͸� ����Ʈ�� �ֱ�
		
		//List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		
		for (String s:data) {
			list.add(s);
		}
		
		//data�߰� �� ���
		for (int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
			
		}
		
		write("�ʱⵥ���� ���", list);
		
		System.out.println("1�� �ε��� �����ϱ�");
		list.remove(1);
		write("1�� ������ ������ ���", list);
		
		System.out.println("���� �߰��ϱ�");
		list.add("����");
		write("���� �߰��� ������ ���", list);
		
		list.set(0, "������");
		write("0���� �ٲٱ�", list);
		
		
		list.clear();
		write("��ü�����ϱ�", list);
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
