package day0208;

class OuterObj{//�̳�Ŭ������ �ƿ�Ŭ������ �־�� �����ִ�
		
			class InnerObj{ //��� ����Ŭ���� -�ϳ��� ��ü�� �ν�-
				
				public void write() {
					System.out.println("**����Ŭ������ �޼���**");
				}
			}
		
	public void disp() {
		System.out.println("�ܺ�Ŭ������ �޼���");
		System.out.println("�ܺο��� ����Ŭ���� �޼��� ȣ��");
		
		//�ܺ�Ŭ�������� ����Ŭ������ ��ü ����
		InnerObj io = new InnerObj(); //�ܺ�Ŭ�������� ����Ŭ���� ��ü����
		io.write();
	}
}
/////////////////////////////////
public class InnerClassEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ܺο��� ����Ŭ���� �����ö� ���������� �̷���
		OuterObj out = new OuterObj();
		out.disp();
		System.out.println("--------------------");
		
		// �ƿ�Ŭ������ ���ؼ��� �ƴϸ� ��������
		//InnerObj io = new InnerObj(); //�ܺ�Ŭ�������� ����Ŭ���� ��ü����
		//io.write();
	
		// ����Ŭ���� �����÷��� �̷��� ��������
		OuterObj.InnerObj obj = new OuterObj().new InnerObj();
		obj.write();
		
		
	}

}
