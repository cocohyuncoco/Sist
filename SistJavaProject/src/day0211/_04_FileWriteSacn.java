package day0211;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _04_FileWriteSacn {

	FileWriter fw;
	static final String FILENAME="C:\\sist0117\\javawork\\test3.txt";

	
	public void dataWrite(){
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter(FILENAME, true);//추가모드
			
			//키보드로 이름,주소,핸드폰 입력후 파일에 저장
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("주소입력");
			String addr = sc.nextLine();
			System.out.println("핸드폰 입력");
			String hp = sc.nextLine();
			
			//파일저장
			fw.write("회원명: "+name+"\n");
			fw.write("주소: "+addr+"\n");
			fw.write("핸드폰번호 : "+hp+"\n-------------------\n");
			
			System.out.println("파일저장확인");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

		_04_FileWriteSacn file = new _04_FileWriteSacn();
		file.dataWrite();
		
		
		
		
	}

}
