package day0217;

//����ǥ������ �������̽��� ����ϴ� �͸���Ŭ������ �ٸ� ǥ����
//�� �ϳ��� �߻�޼��常 ������ �ִ°�츸 ���� (�׷��� �� �Ⱦ�)

interface Orange{
	
	public void write();
		//public void play(); ����ǥ�������� �����Ұ�� �߻�޼��� �ϳ���
		
	
}
///////////////////////////
public class _06_LamdaTest {

	//�͸���Ŭ����
	public void abstMethod1() {
		
		Orange or = new Orange() {
			
			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("���� �͸��� �������Դϴ�");
			}
		};
		or.write();
	}
	
	//���ٽ� ǥ����, ���ٽ����� �������̵��ϱ�
	public void abstMethod2() {
		
		Orange or =()->System.out.println("���� ������ ������");
		or.write();
		
		System.out.println("**�ȿ� ������ �ڵ��ϰ��**");
		
		Orange or2=()->{
			System.out.println("���� ������");
			System.out.println("���� ������");
		};
		or2.write();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_06_LamdaTest ex = new _06_LamdaTest();
		ex.abstMethod1();
		System.out.println("------------------------------");
		ex.abstMethod2();
	}

}
