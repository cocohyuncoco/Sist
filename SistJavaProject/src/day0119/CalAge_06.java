package day0119;

import java.util.Calendar;

public class CalAge_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		String name = args[0]; 

		Calendar cal=Calendar.getInstance();
		int curYear=cal.get(cal.YEAR); //현재년도
		
		//내가 태어난 연도를 파라메타로 보낼때 형변환 필요 (String->int)
		
		int myYear=Integer.parseInt(args[1]);
		
		//나이 구하기
		int myAge=curYear-myYear+1; //나이계산법
		
		System.out.println("내 이름은: "+name);
		System.out.println("태어난년도: "+myYear+"년");
		System.out.println("나이: "+myAge+"살");
	}

}
