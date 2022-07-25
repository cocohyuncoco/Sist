package day0217;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _05_DeSeriaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ex4번에서 자장한 파일 오브젝트로 읽어오기 (역직렬화)
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fi = new FileInputStream("C:\\sist0117\\javawork\\apple.txt");
			oi = new ObjectInputStream(fi);
			
			Apple a=(Apple)oi.readObject();
			
			System.out.println("**파일에서 Apple데이터 **");
			a.write();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
