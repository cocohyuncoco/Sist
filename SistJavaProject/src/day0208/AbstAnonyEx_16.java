package day0208;

abstract class AbstEx1{
	abstract public void dataAdd();
	abstract public void dataList();
}
class SubAbst extends AbstEx1{

	@Override
	public void dataAdd() {
		// TODO Auto-generated method stub
		System.out.println("ȸ���߰�");
	}

	@Override
	public void dataList() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ��� ���");
	}
	
}

/////////////////////////////////
public class AbstAnonyEx_16 {
	//�߻��� ������� �޾Ƶ� �ǰ� �͸��η� �޾Ƶ��ȴ�
	//�͸��δ� �̺�Ʈó���� ���� ���
	
	//�͸��� Ŭ���� ���·� 
	AbstEx1 ab1 = new AbstEx1() {
		
		@Override
		public void dataList() {
			// TODO Auto-generated method stub
			System.out.println("�����͸� ����մϴ�");
		}
		
		@Override
		public void dataAdd() {
			// TODO Auto-generated method stub
			System.out.println("�����͸� �߰��մϴ�");
		}
	}; //<- ; �� ������ �͸�Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ӹ��� Ŭ����
		AbstEx1 abs = null;
		abs = new SubAbst();
		abs.dataAdd();
		abs.dataList();
		
		//�͸��� Ŭ����
		AbstAnonyEx_16 abs1 = new AbstAnonyEx_16();
		abs1.ab1.dataAdd();
		abs1.ab1.dataList();
		

	}

}
