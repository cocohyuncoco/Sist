package day0209;

import java.util.Iterator;

public class _09_ExceptionEx {

	public static void process() {
		// TODO Auto-generated method stub

		int[] arr= {2,5,7,8};
		
		for (int i=0;i<=arr.length;i++) {
			
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�����޼��� 1:"+e.getMessage());
				
			}
		}
	}
	//throws: ������(�ͼ��� ó���� ���������ʰ� �ش�ȣ���ϴ°����� �ͼ����� ������)
	public static void process2() throws NumberFormatException {
		String a="12a";
		String b="30";
		int sum=0;
		
		sum = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("�� ���� ���� "+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		process();
		
		try {
			 process2();
			} catch (Exception e) {
			// TODO: handle exception
				System.out.println("����ó���� ���ο��� �߾��:"+e.getMessage());
		}
		System.out.println("��������");
		
	
		
		}
	}

