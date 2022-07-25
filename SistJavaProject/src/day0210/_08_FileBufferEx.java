package day0210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class _08_FileBufferEx {

	public static void read() {
		
		//경로표시 /, \\
		String filename ="C:\\sist0117\\javawork\\meno1.txt";
		
		BufferedReader br=null;
		FileReader fr=null;
		
		//읽기위해서 파일열기
		try {
			fr = new FileReader(filename);
			System.out.println("파일을 열었어요!!!");
			
			br = new BufferedReader(fr);
			
			//여러줄을 읽어야함으로 while문으로 읽기
			while (true) {
				//메모장에서 내용을 한줄씩 읽는다
				String s = br.readLine();
				
				//마지막줄 일때 null읽는다
				if (s==null) 
					break; //null값일경우 while문 빠져나가기
					System.out.println(s);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없어요:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//파일이나 DB 닫아주는곳..무조건 실행되는 구간 
			//닫을땐 역순
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
		System.out.println("**정상종료**");
		
	}

}
