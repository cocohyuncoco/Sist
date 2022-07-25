package day0209;

import java.io.IOException;
import java.io.InputStream;

/*
 * ���ڽ�Ʈ��: Reader.writer _���ڴ���
 * ����Ʈ��Ʈ��: InputStream,OutputStream _����Ʈ����
 * BufferReader Ŭ������ readLine(); _���پ� �о�´�_flush��� ���۳����� ��Ʈ������ �����ϴ� �۾����ʿ�
 */
public class _06_IOExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ǹ����� �� ����ó��
		InputStream is = System.in; //�ֿܼ��� �Է�
		
		int a=0;
		
		System.out.print("�ѱ��� �Է�:");
		try {
			a=is.read(); //read()�� 1����Ʈ �ۿ� ���д´� - �ѱ��� 2����Ʈ ������ ������..���ϰ��� �ƽ�Ű�ڵ�
		} catch (IOException e) {
			System.out.println("����: "+e.getMessage());
		}
		
		
		System.out.println("**3�ʵڿ� ����մϴ�**");
		
		try {
			Thread.sleep(3000); //�̰� ������ �ݵ�� try�ȿ� �ֱ�
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("�Է°�: "+(char)a);
		
	}

}
