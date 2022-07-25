package day0211;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _05_FileReadWrite {

	static final String FILENAME="C:\\sist0117\\javawork\\test4.txt";
	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	Scanner sc = new Scanner(System.in);

	//����
	public void sungjukIn() {
		//�̸�, ����
		System.out.println("�л����� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("������ �Է��ϼ���");
		int score = Integer.parseInt(sc.nextLine());

		//��������
		try {
			fw = new FileWriter(FILENAME, true);
			
			//�Է³��� ��������
			fw.write(name+"\n");
			fw.write(score+"\n");
			System.out.println("**�л������� �����**");
			
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//�б�..����� ���� �о ����� ���
	public void fileRead() {
		//������� ���
		System.out.println("\t**�л�����**");
		System.out.println("��ȣ\t�̸�\t����\t����");
		System.out.println("------------------------------");

		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			int num=0;

			while (true) {
				String name = br.readLine();

				if(name==null)
					break;

				int score=Integer.parseInt(br.readLine());

				//������ �޼���� ���� �� ���⼭ ȣ��
				char grade= getGrade(score);
				System.out.println(++num+"\t"+name+"\t"+score+"\t"+grade);
			}

			System.out.println("**��� ��**");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
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

	//���� �޼���...������ ���ڷ� �Ѱ� char�� ��ȯ(String)
	public char getGrade(int score) {
		char ch;

		if(score>=90)
			ch='A';
		else if(score>=80)
			ch='B';
		else if(score>=70)
			ch='C';
		else if(score>=60)
			ch='D';
		else
			ch='F';

		return ch;

	}

	///////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_05_FileReadWrite fr = new _05_FileReadWrite();
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.�л������Է� 2.�л�������� 9.����");
			System.out.println("----------------------------");
			num = sc.nextInt();
			if (num==1) {
				fr.sungjukIn();
			}else if(num==2) {
				fr.fileRead();
			}else 
				break;
			}
		
		System.out.println("-------------����------------");
		
		
		
		
		
		
	}
}
