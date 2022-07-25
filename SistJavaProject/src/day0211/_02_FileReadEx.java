package day0211;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 사원명, 기본급, 가족수, 초과근무시간
 * 가족수당=가족수*30000
 * 시간수당=시간수*20000
 * 
 * ***사원급여***
 * 번호   사원명   기본급   가족수    초과근무   가족수당    시간수당    총급여
 * 1     정국   250000  2        12      60000   240000   280000
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
			
			System.out.println("***사원급여***");
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무\t가족수당\t시간수당\t총급여");
			
			while (true) {
				String s = br.readLine();
				
				if(s==null) {
					break;
				}
				num++;
				StringTokenizer st = new StringTokenizer(s, ",");
				
				String name = st.nextToken();
				int gibon = Integer.parseInt(st.nextToken().trim()); //.trim() 앞뒤공백제거
				int famsu = Integer.parseInt(st.nextToken().trim());
				int timesu = Integer.parseInt(st.nextToken().trim());
				
				int famsudang=famsu*30000;
				int timesudang=timesu*20000;
				int total=gibon+famsudang+timesudang; 
				
				System.out.print(num+"\t"+name+"\t"+gibon+"원");
				System.out.print(famsu+"\t"+timesu+"\t"+famsudang+"원\t");
				System.out.print(timesudang+"원\t"+total+"원\n");
				
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
