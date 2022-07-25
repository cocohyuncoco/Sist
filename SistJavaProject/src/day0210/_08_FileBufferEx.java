package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class _08_FileBufferEx {

	public static void read() {
		
		//���ǥ�� /, \\
		String filename ="C:\\sist0117\\javawork\\meno1.txt";
		
		BufferedReader br=null;
		FileReader fr=null;
		
		//�б����ؼ� ���Ͽ���
		try {
			fr = new FileReader(filename);
			System.out.println("������ �������!!!");
			
			br = new BufferedReader(fr);
			
			//�������� �о�������� while������ �б�
			while (true) {
				//�޸��忡�� ������ ���پ� �д´�
				String s = br.readLine();
				
				//�������� �϶� null�д´�
				if (s==null) 
					break; //null���ϰ�� while�� ����������
					System.out.println(s);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ͼ����:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�����̳� DB �ݾ��ִ°�..������ ����Ǵ� ���� 
			//������ ����
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		read();
		System.out.println("**��������**");
		
	}

}
