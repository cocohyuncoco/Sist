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

	//쓰기
	public void sungjukIn() {
		//이름, 점수
		System.out.println("학생명을 입력하세요");
		String name = sc.nextLine();
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());

		//파일저장
		try {
			fw = new FileWriter(FILENAME, true);
			
			//입력내용 파일저장
			fw.write(name+"\n");
			fw.write(score+"\n");
			System.out.println("**학생점수가 저장됨**");
			
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
	//읽기..저장된 파일 읽어서 계산후 출력
	public void fileRead() {
		//제목부터 출력
		System.out.println("\t**학생정보**");
		System.out.println("번호\t이름\t점수\t학점");
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

				//학점은 메서드로 만든 후 여기서 호출
				char grade= getGrade(score);
				System.out.println(++num+"\t"+name+"\t"+score+"\t"+grade);
			}

			System.out.println("**출력 끝**");

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

	//학점 메서드...점수를 인자로 넘겨 char로 반환(String)
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
			System.out.println("1.학생정보입력 2.학생정보출력 9.종료");
			System.out.println("----------------------------");
			num = sc.nextInt();
			if (num==1) {
				fr.sungjukIn();
			}else if(num==2) {
				fr.fileRead();
			}else 
				break;
			}
		
		System.out.println("-------------종료------------");
		
		
		
		
		
		
	}
}
