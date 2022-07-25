package day0211;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class _03_FilewriteEx {

	public static void fileWrite() {
	
		FileWriter fw = null;
		String filename="C:\\sist0117\\javawork\\test1.txt";
		
		try {
			fw = new FileWriter(filename); //파일 새로 생성 (같은이름이 있더라도 새로 생성)
			
			//파일에 내용추가
			fw.write("Have a Nice Day!!\n"); //메모장 줄넘김 안되는 사람은 \r\n
			fw.write(new Date().toString());
			
			System.out.println("**파일저장성공**");
			
		} catch (IOException e) { //해결하기위한 출력문 하나
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
			
			fw.write("내 이름은 이수연!!\n");
			fw.write("---------------------\n");
			fw.write("추가되죠?!!\n");
			
			System.out.println("추가데이터 성공");
			
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
