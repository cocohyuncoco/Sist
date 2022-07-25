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
			fr=new FileReader(filename); //트라이캐치 처리 반드시 하기 / 자동완성생김
			br=new BufferedReader(fr);

			System.out.println("**파일읽기결과**");
			System.out.println("이름\t학교명\t학년");
			System.out.println("----------------------");

			while (true) {
				String s = br.readLine();
				//종료

				if (s==null)
					break;

				//split으로 분리하기 
				//String[] data=s.split(","); //메모장 데이터들을 ,로 구분해서 배열 data에 넣어주기
				//배열갯수만큼 반복해서 출력
				//System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);

				//이번에는 split대신에 StringToknizer을 이용해서 분리
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken()+"학년");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println("파일없어요:"+e.getMessage());
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
