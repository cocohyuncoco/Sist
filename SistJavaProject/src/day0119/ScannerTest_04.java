package day0119;

import java.util.Scanner;

public class ScannerTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner 클래스는 문자열이나 숫자 모두 키보드로 입력받으려 할 때 생성
		
		//1. import
		Scanner sc=new Scanner(System.in);
		
		//2. 변수선언
		String name;
		int age;
		String city;
		
		//3. 입력에 관한 출력 가이드문, 키보드 입력
		System.out.print("이름을 입력해 보세요==>");
		name=sc.nextLine(); //한줄을 문자로 읽어온다 (공백사용가능)
		
		System.out.print("당신의 나이는 몇살?==>");
		//age=sc.nextlnt(); //숫자형태로 읽는건 String-->int
		//숫자 입력후 엔터누르면 그 엔터가 키보드의 버퍼로 저장되어서 다음문자 읽을때
		//먼저 읽어버리는 문제 발생
		//다음 문자열 읽기전에 엔터를 읽어서 없애면된다...sc.nextLine();
		age=Integer.parseInt(sc.nextLine());
		
		System.out.print("사는 지역은?==>");
		city=sc.nextLine();
		//출력
		System.out.println("------------");
		System.out.println("나의 이름은"+name+"입니다");
		System.out.println("나의 나이는"+age+"입니다");
		System.out.println("저는 "+city+" 지역에 살아요");
		
	
	
	
	}

}
