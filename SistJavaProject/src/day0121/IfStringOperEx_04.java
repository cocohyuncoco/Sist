package day0121;

import java.util.Scanner;

public class IfStringOperEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 비교는 관계연산자로 하면 안되고
		// equlas라는 메서드를 사용해서 비교한다
		
		Scanner sc = new Scanner(System.in);
		
		String msg;
		System.out.println("영어단어를 입력하세요");
		System.out.println("입력단어에)happy,angel,rose,winter,summer");
		
		msg=sc.nextLine();
		System.out.println("입력한 문자열: "+msg);
		
		//문자열 동등연산자로 비교하려면 주소 비교를 함..값 비교 equlas 메서드 사요ㅗㅇ
		
		if(msg.equals("angel")) {
			System.out.println("***천사***");}
		else if(msg.equalsIgnoreCase("HAPPY")) {
			System.out.println("***행복하다***");}
		else if(msg.equalsIgnoreCase("rose")) {
			System.out.println("***장미***");}
		else if(msg.equalsIgnoreCase("winter")) {
			System.out.println("***겨울***");}
		else if(msg.equalsIgnoreCase("suMMer")) {
			System.out.println("***여름***");}
		else if(msg.equalsIgnoreCase("김동규")) {
			System.out.println("***방귀쟁이입니다***");}
		else {
			System.out.println("***사전에 없는 문자열 입니다***");}
		}
		
	}

