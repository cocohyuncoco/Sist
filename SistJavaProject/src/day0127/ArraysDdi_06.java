package day0127;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysDdi_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 이름입력
		 * 신지환
		 * 태어난 년도 입력
		 * 1997
		 * 신지환님은 소띠 입니다
		 * 
		 * Scanner
		 * name, myYear
		 */
		
		String[] ddi= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		
		Scanner sc = new Scanner(System.in);
		String name;
		int myYear;
		
		System.out.println("**이름을 입력하세요**");
		name=sc.nextLine();
		System.out.println("***태어난 년도 입력***");
		myYear=sc.nextInt();
		
		//계산
		String myDdi = ddi[myYear%12];
		System.out.println(name+" 님은 "+myDdi+"띠 입니다");
			
		
		
		
		
		
		
	}

}
