package day0207;

/*
 * abstractŬ������ new�� �������� ���ϱ� ������
 * �ν��Ͻ� ������ �ҿ��̾���
 *
 * abstractŬ������ new�� ��������
 * abstract�޼���� abstractŬ���� ������ ���簡��
 * abstractŬ������ �Ϲݸ޼���� �߻�޼��� �� �� ���� ����
 */


abstract public class Fruit_09 {

	//�������
	public static final String MESSAGE="������ ��� ���³�~";
	
	//�Ϲݸ޼���
	public void showTitle() {
		System.out.println("�츮�� �߻�Ŭ������ ���ϴ�");
	}
	
	//�߻�޼���
	//�̿��� �޼��� (����θ� �ְ� ������ ����)
	//abstract�� �ٿ��� �߻�޼��尡 �ȴ�
	//�߻�޼��尡 �� �ϳ��� �����ϸ� �� Ŭ������ �߻�Ŭ������ �ȴ�
	//Ŭ���� �տ��� abstract�� �ٿ����Ѵ�
	//�߻�Ŭ������ ������� ����
	//�������̵��� ���������� ������� �����Ѵ�
	
	abstract public void showMessage();
	

	
	
}
