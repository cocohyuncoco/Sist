package day0210;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/*
 * score.txt를 읽고 총 몇개인지 구하시고
 * 점수에 대한 총점, 평균 구해서 출력
 */
public class _09_FIleBuffer {

	
	public static void scoreRead() throws IOException, FileAlreadyExistsException {
		String filename="C:\\sist0117\\javawork\\score.txt";
		
		//변수선언
		FileReader fr=null;
		BufferedReader br=null;
		int cnt=0; //총갯수
		int total=0;  //총합계
		double avg=0; //평균
		
		//파일읽기
		fr = new FileReader(filename);
		System.out.println("파일 정상적으로 읽음");
		
		br = new BufferedReader(fr);
		
		while (true) {
			String s = br.readLine();
			
			if (s==null) 
				break;
			
		   //문자열 점수를 int로 변환하여 합계랑 개수 구하기
			cnt++; //읽은갯수
		
			total+=Integer.parseInt(s);
		}
		
		//평균 구하기
		avg=(double)total/cnt;
		System.out.println("총개수: "+cnt);
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f",avg);
		
		//자원들 닫기
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
		
		
		
		System.out.println("\n**정상종료**");
	}

}
