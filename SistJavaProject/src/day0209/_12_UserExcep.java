package day0209;

import java.util.Scanner;

class User2Exception extends Exception{
	
	public User2Exception(String message) {
		super(message); //오류메세지를 부모에게 보냄
	}
	
}
/////////////////

public class _12_UserExcep {

	
	public static void wordInput() throws User2Exception {
		Scanner sc = new Scanner(System.in);
		//금지단어
		String[] str = {"광고", "계좌", "돈", "입금"};
		
		String word;
		System.out.println("단어를 입력해주세요");
		word=sc.nextLine();
		
		for (String s:str) {
			if (s.equals(word)) {
				// throw 강제발생 시킬거야 메세지를
				throw new User2Exception("금지된 단어입니다");
			}
		}
		System.out.println("입력한 단어는 ["+word+"] 입니다");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			wordInput();
		} catch (User2Exception e) {
			// TODO: handle exception
			System.out.println("오류: "+e.getMessage());
		}
		System.out.println("종료");
	}

}
