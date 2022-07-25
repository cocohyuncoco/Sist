package day0211;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * �����, �⺻��, ������, �ʰ��ٹ��ð�
 * ��������=������*30000
 * �ð�����=�ð���*20000
 * 
 * ***����޿�***
 * ��ȣ   �����   �⺻��   ������    �ʰ��ٹ�   ��������    �ð�����    �ѱ޿�
 * 1     ����   250000  2        12      60000   240000   280000
 */



public class _02_FileReadEx {
	
	public static void fileRead() {
		
		String filename ="\\sist0117\\javawork\\sawon.txt";
		int num = 0;

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			System.out.println("***����޿�***");
			System.out.println("��ȣ\t�����\t�⺻��\t������\t�ʰ��ٹ�\t��������\t�ð�����\t�ѱ޿�");
			
			while (true) {
				String s = br.readLine();
				
				if(s==null) {
					break;
				}
				num++;
				StringTokenizer st = new StringTokenizer(s, ",");
				
				String name = st.nextToken();
				int gibon = Integer.parseInt(st.nextToken().trim()); //.trim() �յڰ�������
				int famsu = Integer.parseInt(st.nextToken().trim());
				int timesu = Integer.parseInt(st.nextToken().trim());
				
				int famsudang=famsu*30000;
				int timesudang=timesu*20000;
				int total=gibon+famsudang+timesudang; 
				
				System.out.print(num+"\t"+name+"\t"+gibon+"��");
				System.out.print(famsu+"\t"+timesu+"\t"+famsudang+"��\t");
				System.out.print(timesudang+"��\t"+total+"��\n");
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileRead(); 
		
		
	}
	

}
