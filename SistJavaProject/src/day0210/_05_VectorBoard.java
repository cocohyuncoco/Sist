package day0210;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class _05_VectorBoard {

	//Ŭ������ ������ �������� �����͸� ������ �������� Ŭ����
	List<Board> list = new Vector<Board>();
	
	//�������Է�
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		String name, subject, content;
		
		System.out.println("�ۼ��ڸ�?");
		name = sc.nextLine();
		System.out.println("����?");
		subject = sc.nextLine();
		System.out.println("����?");
		content = sc.nextLine();
		
		//Board ����
		//Board data = new Board(name, subject, content);
		//list.add(data);
		
		list.add(new Board(name, subject, content));
		System.out.println("���絥���� ����: "+list.size()+"��"); 
	}
	
	//���������
	public void writeData() {
		System.out.println("**�Խ���**");
		System.out.println("-----------------------");
		
		for (int i=0;i<list.size();i++) {
			Board b = list.get(i); //����Ʈ�� ������ ��ġ���ִ� ��Ұ� ������
			System.out.println("No: "+(i+1)+"\t�ۼ���: "+b.getName());
			System.out.println("����: "+b.getSubject());
			System.out.println("����: "+b.getContent());
			System.out.println("-----------------------");	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_05_VectorBoard vt = new _05_VectorBoard();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("1.�߰� 2.��ü���  9.����");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==1) {
				vt.inputData();
			}else if (n==2) {
				vt.writeData();
			}else {
				System.out.println("�����մϴ�");
				break;
			}
			
		}

		
		
	}

}
