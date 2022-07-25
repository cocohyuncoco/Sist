package day0209;


import java.util.Scanner;

// ��������� Exception

class UserException extends Exception{
	
	public UserException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
///////////////////////

public class _11_UserException {
	
	public static void process() throws UserException{
		
		Scanner sc = new Scanner(System.in);
		
		int age =0;
		//���̰� 20~40���� �ƴϸ� UserException �����߻�
		System.out.println("���̸� �Է��ϼ���");
		age=sc.nextInt();
		
		if (age<20 || age>40) {
			throw new UserException("����� �ɼ� �����ϴ�");
		}else {
			System.out.println("����� "+age+"�� �̹Ƿ� ����� ��ϵ�");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			process();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			e.getMessage();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("��������");
		
	}

}
