package day0119;

public class CastArgsTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Q. �Ű������� �̿��Ͻð� ������ ������� �����ּ���
		 * ��ǰ��: ������13mini
		 * ����: 20��
		 * �ܰ�: 950.000��
		 * �ѱݾ�: ******��
		 * /		
		 */
		String sang=args[0];
		int amount=Integer.parseInt(args[1]);
		int price=Integer.parseInt(args[2]);
		
		int total=amount*price;
		
		System.out.println("��ǰ��:"+sang);
		System.out.println("����:"+amount+"��");
		System.out.println("�ܰ�:"+price+"��");
		System.out.println("�ѱݾ�:"+total+"��");
	
		
	}

}
