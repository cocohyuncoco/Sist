package day0209;
//���� ���� ����
interface Sawon{ 
	//�������̽��� abstract�� ���̴� �������̽� ���� abstract�ۿ� �����´� �׷��� ��������
	public void addSawon();
	public void deletSawon();
	public void listSawon();
}
///////////////////////////

public class _01_InnerReview {

	//sawon �������̽��� �͸���Ŭ���� �������� ���� �� ���ο��� �� �޼��� ȣ��
	Sawon sa = new Sawon() {
		
		@Override
		public void listSawon() {
			// TODO Auto-generated method stub
			System.out.println("������ ���");
		}
		
		@Override
		public void deletSawon() {
			// TODO Auto-generated method stub
			System.out.println("��� ���");
		}
		
		@Override
		public void addSawon() {
			// TODO Auto-generated method stub
			System.out.println("��� �Ի�");
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_01_InnerReview ir = new _01_InnerReview();
		ir.sa.listSawon();
		ir.sa.addSawon();
		ir.sa.deletSawon();
		
	}

}
