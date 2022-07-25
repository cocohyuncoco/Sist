package day0119;

import java.util.Calendar;
import java.util.Scanner;


public class ScanCalAge_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Q. Sanner, Calenadar를 import받아 완성하시오
		 * 키보드로 입력받는건 name,myYear
		 * 출력은 요렇게 해주세요
		 * 현재년도: 2022년
		 * 당신의 이름은? 홍길동
		 * 태어난 년도는? 1997
		 * ---------------------
		 * 홍길동님은 1997년 생이며 26세 입니다		
		 */
		
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		
		int curYear=cal.get(cal.YEAR); //현재년도
		
		String name;
		int myYear;
		int age;
		
		System.out.println("현재년도: "+curYear);
		
		System.out.println("당신의 이름은?");
		name=sc.nextLine(); //이름을 문자열로 읽어온다
		
		System.out.println("태어난 년도는?");
		myYear=sc.nextInt(); //이름을 문자열로 읽어온다
		
		//나이계산
		age=curYear-myYear+1;
		
		System.out.println("----------------");
		System.out.println(name+" 님은 "+myYear+" 년 생이며 "+age+" 세 입니다");
		
		
	}

}
