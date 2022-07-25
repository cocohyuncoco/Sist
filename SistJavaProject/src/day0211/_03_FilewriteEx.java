package day0211;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class _03_FilewriteEx {

	public static void fileWrite() {
	
		FileWriter fw = null;
		String filename="C:\\sist0117\\javawork\\test1.txt";
		
		try {
			fw = new FileWriter(filename); //���� ���� ���� (�����̸��� �ִ��� ���� ����)
			
			//���Ͽ� �����߰�
			fw.write("Have a Nice Day!!\n"); //�޸��� �ٳѱ� �ȵǴ� ����� \r\n
			fw.write(new Date().toString());
			
			System.out.println("**�������强��**");
			
		} catch (IOException e) { //�ذ��ϱ����� ��¹� �ϳ�
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void fileWrite2() {
		
		FileWriter fw = null;
		String filename="C:\\sist0117\\javawork\\test2.txt";
		
		try {
			fw = new FileWriter(filename, true);
			
			fw.write("�� �̸��� �̼���!!\n");
			fw.write("---------------------\n");
			fw.write("�߰�����?!!\n");
			
			System.out.println("�߰������� ����");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileWrite();
		fileWrite2();
	}

}
