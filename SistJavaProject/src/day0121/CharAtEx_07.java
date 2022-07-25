package day0121;

import java.util.Scanner;

public class CharAtEx_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.println("알파벳 한글자 입력");
		
		//입력한 문자열의 첫 글자 가져오기
		ch = sc.nextLine().charAt(0);
		System.out.println("ch = "+ch);
		
		switch (ch) {
		case 'a': case 'A':
			System.out.println("Apple");
			break;
		case 'b': case 'B':
			System.out.println("Banner");
			break;
		case 'o': case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("Other Fruits");
			break;
		}
		
		
		
		
		
		
	}
}
