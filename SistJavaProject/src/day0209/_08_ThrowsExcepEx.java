package day0209;

import java.util.Scanner;

/*
 * throws: ȣ���� �������� ����ó�� �� ����
 * throw: ������ ���ܸ� �߻���ų��
 */
public class _08_ThrowsExcepEx {

	public static void scoreInput() throws Exception{
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int score=0;
		System.out.println("������ �Է��ϼ���");
		//0~100�� �Է����� ������ �ͼ��� �����߻� ��ų ����
		
		score=sc.nextInt();
		
		if (score<0 || score>100) {
			throw new Exception("������ �߸� �ԷµǾ����");
		}else {
			System.out.println("���� ������"+score+"�Դϴ�");
		}
			
		
	}
	
	public static void main(String[] args) {
		
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("�����޼���:"+e.getMessage());
		}
		System.out.println("��������");
	}
		
	

}
