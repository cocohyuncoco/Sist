package day0208;

import java.util.Scanner;

interface Command{
	
	//���⿡�� �����
	//�߻�Ŭ������ ���ü��ֵ�
	
	public void while2();
}
////////////////////////////////
class Insert2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("�Խ��ǿ� ���� �߰��մϴ�");
	}	
}
////////////////////////////////
class Modify2 implements Command{ //�̱����޼��带 ���ó� �����ؾ���

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("�Խ��ǿ� ���� �����մϴ�");
	}
}
////////////////////////////////
class Delete2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("�Խ��ǿ� ���� �����մϴ�");
	}
}
////////////////////////////////
class List2 implements Command{

	@Override
	public void while2() {
		// TODO Auto-generated method stub
		System.out.println("�Խ��ǿ� ���� ����մϴ�");
	}
}
////////////////////////////////
public class InheriEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Command comm = null; //������
		
		int n;
		
		
		
		exit: while (true) {
			System.out.println("1.�߰� 2.���� 3.���� 4.��� 5~.����");
			System.out.println("=============================");
			System.out.print("select==>");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				comm = new Insert2();
				break;
			case 2:
				comm = new Modify2();
				break;
			case 3:
				comm = new Delete2();
				break;
			case 4:
				comm = new List2();
				break;

			default:
				System.out.println("����");
				break exit;
			}
			
			if (n<=4) {
				comm.while2(); //1,2,3,4
			}else {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
