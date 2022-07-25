package day0210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _06_MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "���缮");
		map.put("age", "23");
		map.put("addr", "����� �����");
		map.put("name", "����"); //���� Ű���� ��� ���� �����ʹ� ������
		
		System.out.println("size: "+map.size());
		System.out.println("Ű���� �˸� ��Ȯ�ϰ� value�� ��´�");
		System.out.println("�̸�: "+map.get("name"));
		System.out.println("����: "+map.get("age"));
		System.out.println("�ּ�: "+map.get("addr"));
		
		System.out.println("������: "+map.get("blood")); //map�� ���� Ű���� null�� ��µ�
		
		System.out.println("--------------------------");
		System.out.println("Ű���� ���� �ѹ��� ������ ���� ���");
		Set<String> keySet = map.keySet();
		
		System.out.println("���#1");
		
		for (String key:keySet) {
			System.out.println(key+"-->"+map.get(key));
			
		}
		System.out.println("--------------------------");
		System.out.println("���#2");
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.println(key+"-->"+map.get(key));
			
		}
		
	}

}
