package day0210;

import java.util.Iterator;
import java.util.StringTokenizer;

public class _10_TokenEx {

	public static void main(String[] args) {
		// ���ڿ��� Ư�����ڷ� �и��ϴ� ���
		
		String str ="red,blue,yellow,whilt,pink,purple,orange";
		
		System.out.println("String ��ü���� split �� �̿��� �и�");
		String[] arr= str.split(",");
		System.out.println("��"+arr.length+"��");
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
			
		}

		System.out.println("StringTokenizer �� �̿��� �и�");
		StringTokenizer st =new StringTokenizer(str,",");
		System.out.println("�� ��ū��: "+st.countTokens());
		
		while (st.hasMoreTokens()) { //������ū ������ true, ������ false ��ȯ
			System.out.println(st.nextToken()); //������ū����
			
		}
		
	}

}
