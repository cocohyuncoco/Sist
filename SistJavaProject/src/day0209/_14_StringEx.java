package day0209;

import java.util.Iterator;
import java.util.Scanner;

public class _14_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []names = {"������","������","������","�̴ټ�","������","�����","�̰���","���¹�","���θ�"};
		
		Scanner sc = new Scanner(System.in);
		String name="";
		int cnt=0;
		
		while (true) {
			System.out.println("�˻��� �̸�(�Ϻθ�����)");
			name=sc.nextLine();
			
			//break��
			if (name.equalsIgnoreCase("q")) {
				System.out.println("�����մϴ�");
				break;
			} 
			
			cnt=0;
			for (String s:names) {
				if (s.startsWith(name)) {
					cnt++;
					System.out.println(s);
				}
			}
			System.out.println("====�� "+cnt+"���� �ֽ��ϴ�====");
			System.out.println();
			
			
		}
	}

}
