package day0211;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _01_FomatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(); //����Ÿ �ƴ� ����Ʈ 
		System.out.println(date);
		
		//��¥, �ð��� ���ϴ� ������� ���
		
		//�������� �� �̰ž�. ��¥�� ��¥ ���� �� �������մ°�.
		//HH:24�ð� MM:�� mm:��
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd HH:mm");//��¥�̰� ���� ���ϰ� ���̴°͵�
		System.out.println(sdf1.format(date));

		
		//hh:12�ð�ǥ�� a:����/����
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		
		//EEE:����ª�� EEEE:���ϱ��
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");  
		System.out.println(sdf3.format(date));
		
		
		//NumberFormat
		int money = 674556;
		Double num = 51.5421;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US); //ȭ������� �ĸ����� / �̱�
		//NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA); //�߱�
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance(); //�ĸ�����
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
		
	}

}
