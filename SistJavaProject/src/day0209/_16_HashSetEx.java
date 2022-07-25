package day0209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day0203.StudentInfoTest_10;

//��״� ����� �߿�. ����ϱ� ���ѰŶ�� ����ȴ�. �׶��׶� �����͸� �����ϰ� �����ϴ°� �����һ�
/*
 * <���׸�> ����� �ڷ���(string, int..class..��)
 * <�÷���> �ڷᱸ�� (set,vector, arraylist...)
 * 
 * **���¹�** 							
 * (�������̽� or Ŭ������)<��������> ��ü�̸� = new Ŭ������<��������>
 * 										(�ݵ��Ŭ������)
 *  �迭�� �޸� ������
 *  
 *  List: ������ �߿��Ҷ�, �ε�����ġ�� �˰��ִ�, �ߺ�����
 *  Set: ���ϼ��� �߿��Ҷ�, �ߺ�������� �ʴ´�
 *  Map: Ű(key),��(value)
 */

public class _16_HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<String>(); //set�� ��ü���� �ȵ�
		//Set �ȿ� String�����͸� ��ڴ� �ǹ�
		
		set1.add("���");
		set1.add("�ٳ���");
		set1.add("Ű��");
		set1.add("���");//�ߺ��� ���Ծȉ�
		set1.add("������");
		set1.add("����");
		
		System.out.println("�����Ͱ���:"+set1.size());
		System.out.println(set1);
		System.out.println("------------------------");
		/*
		 * Iterlator �������̽� - ���������
		 * �÷���Ŭ������ ���ؼ� Iterlator�� ���� ���� �ݺ�, �ַ� while�� ������ �о�´�
		 * 
		 */
		
		System.out.println("Set ��״� �ߺ��� �߿��ϴ�. ������ �߿��ϸ� List����. �׷��� List�� ���̾���");
		System.out.println("****���#1****");
		
		for (String s:set1) {
			System.out.println(s);
			
		}
		System.out.println("------------------------");
		System.out.println("****���#2****");		
		
		Iterator<String> iter=set1.iterator();
		
		while (iter.hasNext()) {//�����Ͱ� ���̻� ������ false��ȯ 
			
			//������ ��ұ��� �����ְڴ�. �����ٰ� ������ true, ���̻� �����ٰ� ������ false
			String s=iter.next();  
			System.out.println(s);
			
		}
		System.out.println("------------------------");
		System.out.println("****���#3****");	
		
		Object[] ob=set1.toArray(); //������Ʈ�� ��ȯ
		
		for (int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);			
		}
		
		System.out.println("------------------------");
		System.out.println("****���#4****");	
		
		set1.clear(); //��� ������ ����
		if (set1.isEmpty()) {
			System.out.println("set�ȿ� �����Ͱ� ����");
		}else {
			System.out.println("�����Ͱ� �ִ�");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
