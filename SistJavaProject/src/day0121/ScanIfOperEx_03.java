package day0121;

import java.util.Scanner;

public class ScanIfOperEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �ܰ��� �Է��� �� �ݾ��� �˾ƺ���
		// �������� �̻��� �����ϸ� �����ݾ��� ������ �شٰ� �����غ���
		
		Scanner sc = new Scanner(System.in);
		
		
		String sangpum;
		int su,dan,total;

		System.out.println("��ǰ�� ��?");
		sangpum = sc.nextLine();
		System.out.println("������?");
		su = sc.nextInt();
		System.out.println("������?");
		dan = sc.nextInt();
		
		total = su*dan;
		System.out.println(sangpum+" �� �ݾ�= "+total+"��");
		System.out.println("5�� ���Խ� �ѱݾ��� 10% DC �ص帳�ϴ�");
		
		int dc;
		
		if(su>=5){
			dc=total*1/10;
			System.out.println("���ε� ���� = "+dc);
		}
			 
		
		
	}

}
