package day0121;

public class CharAtEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "951102-2276545";
		
		//index ������ 0������
		
		
		char seventh = jumin.charAt(7);
		
		//���ǹ��� �̿��Ͽ� ����, ����, 2000�� ���� ����, ���� ���� ���Ͻÿ�
		if (seventh=='1') 
			System.out.println("����� ����");
		else if(seventh=='2') 
			System.out.println("����� ����");
		else if(seventh=='3') 
			System.out.println("����� 2000�� �� �� ����");
		else if(seventh=='4')
			System.out.println("����� 2000�� �� �� ����");
		else
			System.out.println("����");
		
			
	
	}

}
