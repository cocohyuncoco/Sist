package day0209;

import java.util.Scanner;

class User2Exception extends Exception{
	
	public User2Exception(String message) {
		super(message); //�����޼����� �θ𿡰� ����
	}
	
}
/////////////////

public class _12_UserExcep {

	
	public static void wordInput() throws User2Exception {
		Scanner sc = new Scanner(System.in);
		//�����ܾ�
		String[] str = {"����", "����", "��", "�Ա�"};
		
		String word;
		System.out.println("�ܾ �Է����ּ���");
		word=sc.nextLine();
		
		for (String s:str) {
			if (s.equals(word)) {
				// throw �����߻� ��ų�ž� �޼�����
				throw new User2Exception("������ �ܾ��Դϴ�");
			}
		}
		System.out.println("�Է��� �ܾ�� ["+word+"] �Դϴ�");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			wordInput();
		} catch (User2Exception e) {
			// TODO: handle exception
			System.out.println("����: "+e.getMessage());
		}
		System.out.println("����");
	}

}
