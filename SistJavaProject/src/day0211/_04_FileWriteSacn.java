package day0211;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _04_FileWriteSacn {

	FileWriter fw;
	static final String FILENAME="C:\\sist0117\\javawork\\test3.txt";

	
	public void dataWrite(){
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter(FILENAME, true);//�߰����
			
			//Ű����� �̸�,�ּ�,�ڵ��� �Է��� ���Ͽ� ����
			System.out.println("�̸��Է�");
			String name = sc.nextLine();
			System.out.println("�ּ��Է�");
			String addr = sc.nextLine();
			System.out.println("�ڵ��� �Է�");
			String hp = sc.nextLine();
			
			//��������
			fw.write("ȸ����: "+name+"\n");
			fw.write("�ּ�: "+addr+"\n");
			fw.write("�ڵ�����ȣ : "+hp+"\n-------------------\n");
			
			System.out.println("��������Ȯ��");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

		_04_FileWriteSacn file = new _04_FileWriteSacn();
		file.dataWrite();
		
		
		
		
	}

}
