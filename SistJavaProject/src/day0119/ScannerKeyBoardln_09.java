package day0119;

import java.util.Scanner;

public class ScannerKeyBoardln_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ***이름을 입력하세요***
		 * 곽경태
		 * ***핸드폰 번호를 입력하세요***
		 * 010-777-9999
		 * ***주소를 입력하세요***
		 * 서울시 양천구 목동
		 * =======================
		 * [입력결과]
		 * 이름:홍길동
		 * 핸드폰:010-777-9999
		 * 주소:서울시 양천구 목동
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String name,hp,addr;
		
		System.out.println("***이름을 입력하세요***");
		name=sc.nextLine();		;
		System.out.println("***핸드폰 번호를 입력하세요***");
		hp=sc.nextLine();		
		System.out.println("***주소를 입력하세요***");
		addr=sc.nextLine();		;
		
		System.out.print("=================");
		System.out.println("\t[입력결과]");
		System.out.println("\t이름: "+name);
		System.out.println("\t핸드폰: "+hp);
		System.out.println("\t주소: "+addr);	
		
	}
	

}
