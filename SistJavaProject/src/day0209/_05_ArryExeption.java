package day0209;

import java.util.Iterator;

public class _05_ArryExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str = {"apple","Orange","kiwi","banana"};
		System.out.println("**���ʴ�� ���**");
		
		for (int i=0;i<=str.length;i++) {
			try {
				System.out.println(str[i]);	
			} catch (Exception e) {
				System.out.println("����-> "+e.getMessage());
			}
			
		}
		System.out.println();
		System.out.println("**�Ųٷ� ���**");
	
		for (int i=str.length-1;i>=0;i--) { //int i=str.length-1
			try {
				System.out.println(str[i]);	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("**���α׷� ����**");
		
	}

}
