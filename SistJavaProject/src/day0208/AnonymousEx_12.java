package day0208;

//�ѹ� �̺�Ʈ ó���Ǹ� �ٷ� ������� ������ �̸����� �ʿ����
//���ǵ� Ŭ������ �̸��� ���� -> �͸�Ŭ����
//�־���? ��ȸ��
//�̺�Ʈ �߻��ϰ� ������ �޸𸮿��� ���� �ȴ�


abstract class AbstEx{
	
	//abstractŬ������ �Ϲݸ޼��嵵 �����Ҽ� �ִ�
	abstract public void show(); 
}
class OutEx{
	
	//Ŭ���� ������ ��ü�� ������ ���ÿ� �ϴ� �̸����� Ŭ����(1ȸ��)
	AbstEx ab = new AbstEx() {//�̰� �͸���Ŭ����
		
		@Override
		public void show() {//Ŭ����ó�� �Ⱥ��̴µ� Ŭ������
			// TODO Auto-generated method stub
			System.out.println("�͸��� Ŭ����");
			
		}
	};
}
////////////////////////////////////
public class AnonymousEx_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�͸���Ŭ������ ��� �ҷ��ñ�?
		
		OutEx ex = new OutEx();
		ex.ab.show();
	}

}
