package day0203;

import java.util.Calendar;

import day0203_01.TestP;

public class ConstEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TestP t1 = new TestP(); <- �ȸ������ private �̶�
		// private �� �ٸ� ��Ű�������� �����ȵ�

		TestP t1 = TestP.getInstance();
		t1.writMessage();

		//Calendar cal= new Calendar(); // �����ڰ� protected �̹Ƿ� ����
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		System.out.println(y+"�� �Դϴ�.");


	}

}

