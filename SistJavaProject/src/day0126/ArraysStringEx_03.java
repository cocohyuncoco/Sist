package day0126;

import java.util.Iterator;

public class ArraysStringEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str;
		str=new String[4];
		
		str[0]="ȫ�浿";
		str[1]="�赿��";
		str[2]="������";
		str[3]="�踲��";
		//�ʱ�ȭ �����ָ� null
		
		System.out.println("���1_for");
		for (int i=0;i<str.length;i++) {
			System.out.println((i+1)+":"+str[i]);
			
		}
		
		System.out.println("���2_for~each");
		for (String s:str) {
			System.out.println(s);
			
		}
		
		
	}

}
