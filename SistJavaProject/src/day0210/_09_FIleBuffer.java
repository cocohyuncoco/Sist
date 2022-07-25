package day0210;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/*
 * score.txt�� �а� �� ����� ���Ͻð�
 * ������ ���� ����, ��� ���ؼ� ���
 */
public class _09_FIleBuffer {

	
	public static void scoreRead() throws IOException, FileAlreadyExistsException {
		String filename="C:\\sist0117\\javawork\\score.txt";
		
		//��������
		FileReader fr=null;
		BufferedReader br=null;
		int cnt=0; //�Ѱ���
		int total=0;  //���հ�
		double avg=0; //���
		
		//�����б�
		fr = new FileReader(filename);
		System.out.println("���� ���������� ����");
		
		br = new BufferedReader(fr);
		
		while (true) {
			String s = br.readLine();
			
			if (s==null) 
				break;
			
		   //���ڿ� ������ int�� ��ȯ�Ͽ� �հ�� ���� ���ϱ�
			cnt++; //��������
		
			total+=Integer.parseInt(s);
		}
		
		//��� ���ϱ�
		avg=(double)total/cnt;
		System.out.println("�Ѱ���: "+cnt);
		System.out.println("����: "+total);
		System.out.printf("���: %.2f",avg);
		
		//�ڿ��� �ݱ�
		br.close();
		fr.close();
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			scoreRead();
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("\n**��������**");
	}

}
