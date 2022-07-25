package day0120;

import java.util.Calendar;
import java.util.Scanner;

public class CalAgeDdi_08 {

	public static void main(String[] args) {
		
		// 삼항연산자(조건연산자)
		
		Scanner sc = new Scanner(System.in); // new = 생성자를 통해서 만드는. 생성은 거의 new로 쓴다. 가끔가다 get
		Calendar cal = Calendar.getInstance(); //달력, 수학공식은 getInstance로 가져와서 쓴다
		
		//변수선언
		int curYear = cal.get(cal.YEAR); //현재년도
		int myYear,age; // 내 출생년도, 나이
		String name,ddi; // 내 이름, 띠
		
		//입력
		System.out.println("이름입력: ");
		name = sc.nextLine();
		System.out.println("출생년도: ");
		myYear = sc.nextInt();
		
		//나이계산
		age = (curYear-myYear)+1;
		
		//삼항연산자 써서 내 나이 보이게하기
		//수식?"참":"거짓"
		// 조건이 여러개 일땐 보통 if 문 / 조건이 하나,두개,짧거나,출력문 안에서 한줄로 쓸때 삼항연산자 쓴다
		// 띠가 12개니까 11개 더 써야함
		// 조건이 12개가 있으면 조건문 11개를 써줌
		// 조건에 안맞는 애들은 다 거짓
		
		ddi = myYear%12==0?"원숭이":
				myYear%12==1?"닭":
				   myYear%12==2?"개":
					   myYear%12==3?"돼지":
						   myYear%12==4?"쥐":
							   myYear%12==5?"소":
								   myYear%12==6?"호랑이":
									   myYear%12==7?"토끼":	  
										   myYear%12==8?"용":
											   myYear%12==9?"뱀":
												   myYear%12==10?"말":"양";
		
		//최종출력
		System.out.println("[나이, 띠 구하기]");
		System.out.println("이름은 "+name);
		System.out.println("나이는 "+age);
		System.out.println("띠는 "+ddi+"띠");
		
		
	}
}
