package day0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * ���帹�� ����ϴ� list �������̽�
 * 
 * List�������̽��� ������ Ŭ������_Vector, ArrayList
 * -���������� �����Ͱ� ����
 * -�ߺ������� ����Ѵ�
 * -�����ڰ� ����Ʈ�� ��� �⺻�Ҵ� ũ�� 10, ��ġ�� 2�辿 ����
 * -�����ڰ�(5,3) -�Ҵ�ũ�� 5...�����ÿ� 3������(5,8,11....)
 */
public class _02_ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� �� ���Ѵ�� �ϱ�
		Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		//List<String> list = new ArrayList<String>();
		
		System.out.println("�ʱ� �Ҵ� ũ��"+list.capacity()); //�����ڰ� ����Ʈ�� ��� �⺻�Ҵ� 10 ���
		System.out.println("�ʱ� �����Ͱ���"+list.size()); //����Ʈ�϶� ����� 0
		System.out.println("---------------------------");
		
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("Ű��");
		list.add("�ٳ���");
		//list.add(7); ���׸� Ÿ���� ����� �����͸� ��´�.
		System.out.println("�Ҵ�ũ��"+list.capacity()); 
		System.out.println("�����Ͱ���"+list.size());
		System.out.println("---------------------------");
		
		//���� ��¹���� for�� for��ġ �� ���� ���־���
		System.out.println("��¹��#1");
		/*
		 * get(int index)-����Ʈ���� ������ ��ġ�� �ִ� ��Ҹ� �����ش� (�������� ������������)
		 *
		 */
		for (int i=0;i<list.size();i++) {
			String s = list.get(i);//���� �����Ҷ� ���� get�޼���. ���־���
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		//for��ġ�� �����Ѵ�
		System.out.println("��¹��#2");
		for (String s:list) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		//���ͷ����ͷ� ���
		System.out.println("��¹��#3");
		Iterator<String> iter=list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		System.out.println("---------------------------");
		//������Ʈ �� ���
		System.out.println("��¹��#4");
		/*
		 * toArray(); ����Ʈ ���� ����Ҹ� ������� �����ϰ��ִ� �迭�� �־��ش�(��ȯ�� Object[]) 
		 */
		Object[] ob = list.toArray(); //����Ʈ�� �迭 ���·� ���� ������Ʈ�� ��ȯ�ޱ�
		
		for (int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
			
		}
		
		
	}}


