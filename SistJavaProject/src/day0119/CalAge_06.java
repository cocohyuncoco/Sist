package day0119;

import java.util.Calendar;

public class CalAge_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		String name = args[0]; 

		Calendar cal=Calendar.getInstance();
		int curYear=cal.get(cal.YEAR); //����⵵
		
		//���� �¾ ������ �Ķ��Ÿ�� ������ ����ȯ �ʿ� (String->int)
		
		int myYear=Integer.parseInt(args[1]);
		
		//���� ���ϱ�
		int myAge=curYear-myYear+1; //���̰���
		
		System.out.println("�� �̸���: "+name);
		System.out.println("�¾�⵵: "+myYear+"��");
		System.out.println("����: "+myAge+"��");
	}

}
