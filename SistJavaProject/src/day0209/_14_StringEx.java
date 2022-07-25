package day0209;

import java.util.Iterator;
import java.util.Scanner;

public class _14_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []names = {"김은비","곽경태","차동현","이다솔","김주찬","김민지","이강진","김태민","차두리"};
		
		Scanner sc = new Scanner(System.in);
		String name="";
		int cnt=0;
		
		while (true) {
			System.out.println("검색할 이름(일부만도됨)");
			name=sc.nextLine();
			
			//break문
			if (name.equalsIgnoreCase("q")) {
				System.out.println("종료합니다");
				break;
			} 
			
			cnt=0;
			for (String s:names) {
				if (s.startsWith(name)) {
					cnt++;
					System.out.println(s);
				}
			}
			System.out.println("====총 "+cnt+"명이 있습니다====");
			System.out.println();
			
			
		}
	}

}
