
package day0119;

import java.util.Calendar;

public class CalenderTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calendar cal = Calendar.getInstance();
		 
		 
		 System.out.println("������"+(cal.get(cal.MONTH)+1)+"�� �Դϴ�"); //���� �׻� 1�� ��������Ѵ�. �޷��� �츮���󿡼� ����� �ƴ϶� �ٸ�. ����ǥ�� �������� �̷��� 1�� ���Ѵ�
		 System.out.println("������"+cal.get(cal.DAY_OF_MONTH)+"�� �Դϴ�");
		 System.out.println("�ð���"+cal.get(cal.HOUR_OF_DAY)+"��"+cal.get(cal.MINUTE)+"��");
	}

}
