package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _12_FileToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="C:\\sist0117\\javawork\\phone.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			System.out.println("**�԰� ��ǰ ��Ȳ**");
			System.out.println("��ǰ��\t����\t�ܰ�");
			System.out.println("----------------------");
			
			while (true) {
				String s = br.readLine();
				
				if (s==null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken());
				
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

}
