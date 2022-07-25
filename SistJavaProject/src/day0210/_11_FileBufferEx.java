package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _11_FileBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="C:\\sist0117\\javawork\\info1.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr=new FileReader(filename); //Ʈ����ĳġ ó�� �ݵ�� �ϱ� / �ڵ��ϼ�����
			br=new BufferedReader(fr);

			System.out.println("**�����б���**");
			System.out.println("�̸�\t�б���\t�г�");
			System.out.println("----------------------");

			while (true) {
				String s = br.readLine();
				//����

				if (s==null)
					break;

				//split���� �и��ϱ� 
				//String[] data=s.split(","); //�޸��� �����͵��� ,�� �����ؼ� �迭 data�� �־��ֱ�
				//�迭������ŭ �ݺ��ؼ� ���
				//System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);

				//�̹����� split��ſ� StringToknizer�� �̿��ؼ� �и�
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken()+"�г�");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println("���Ͼ����:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



	}

}
