package day0208;

import java.util.Scanner;

//�Խ��Ƿ����� ������ ���� ����Եȴ�. �Խ��� �ȿ��� ��� �������ִ�
abstract class Board{ //�Ϲݸ޼��嵵 �������ִ�
	
	public abstract void process(); //����ΰ� ���� �̿��� �޼��� 	
}
/////////////////////////
class List extends Board{

	@Override
	public void process() { //�߻�Ŭ������ ��ӹ����� �̷��� �̿��Ǹ޼��� �������̵� �޾ƾ��Ѵ�
		// TODO Auto-generated method stub
		System.out.println("�Խ����� ���� ����մϴ�");
	}
	
}
/////////////////////////
class write extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�Խ����� ���� �ۼ��մϴ�");
	}
	
}
/////////////////////////
class Update extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�Խ����� ���� �����մϴ�");
	}
	
}
/////////////////////////
class Delete extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�Խ����� ���� �����մϴ�");
	}
	
}
//////////////////////////////////////////////////
public class AbstEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�߻�Ŭ������ ������ �������̵��̴�. ��� �Ϲ� �޼��嵵 �������ִ�. �������̽����� ������
		
		//Board bo = new Board(); �߻�Ŭ������ new�� ��ü������ �ȵȴ�. ���������� �ۿ� �ȵ�
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		Board bo = null;
		
		while (true) {
			System.out.println("1.���ۼ� 2.����� 3.���� 4.���� 9.����");
			num=sc.nextInt();
			switch (num) {
			case 1:
				bo=new write();
				break;
			case 2:
				bo=new List();
				break;
			case 3:
				bo=new Update();
				break;
			case 4:
				bo=new Delete();
				break;	
			default:
				System.out.println("�����մϴ�");
				System.exit(0); //�������� 
				break;
			}
			
			bo.process(); //�����Ѱſ� ���� ȣ��
		}
		
				
		
		
	}

}
