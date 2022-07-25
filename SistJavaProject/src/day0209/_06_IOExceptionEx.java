package day0209;

import java.io.IOException;
import java.io.InputStream;

/*
 * 문자스트림: Reader.writer _문자단위
 * 바이트스트림: InputStream,OutputStream _바이트단위
 * BufferReader 클래스는 readLine(); _한줄씩 읽어온다_flush라는 버퍼내용을 스트림으로 전송하는 작업이필요
 */
public class _06_IOExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실무에선 이 예제처럼
		InputStream is = System.in; //콘솔에서 입력
		
		int a=0;
		
		System.out.print("한글자 입력:");
		try {
			a=is.read(); //read()는 1바이트 밖에 못읽는다 - 한글은 2바이트 임으로 못읽음..리턴값은 아스키코드
		} catch (IOException e) {
			System.out.println("오류: "+e.getMessage());
		}
		
		
		System.out.println("**3초뒤에 출력합니다**");
		
		try {
			Thread.sleep(3000); //이걸 쓸려면 반드시 try안에 넣기
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("입력값: "+(char)a);
		
	}

}
