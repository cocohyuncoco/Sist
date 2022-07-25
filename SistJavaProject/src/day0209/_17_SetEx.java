package day0209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _17_SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1 = new HashSet<Integer>();

		set1.add(5);
		set1.add(11);
		set1.add(45);
		set1.add(78);
		set1.add(5); //�ߺ���� ����. int�� String�̴�
		
		System.out.println("����:"+set1.size()); //�׷��� 4������
	
		
		System.out.println("****���#1****");
		for (int i:set1) {
			//System.out.print(i+" ");
			System.out.printf("%5d", i);
		}
		
		System.out.println("\n****���#2****");
		
		Iterator<Integer> iter = set1.iterator();
		
		while (iter.hasNext()) {
			//Integer s=iter.next();
		//	System.out.print(s+" ");
			System.out.printf("%5d",iter.next());
		}
		
		System.out.println("\n****���#3****");
		
		
		Object[] ob = set1.toArray();
		
		for (int i=0;i<ob.length;i++) {
			//System.out.print(ob[i]+" ");
			System.out.printf("%5d", ob[i]);
		}
		
	}

}
