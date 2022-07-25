
package day0119;

import java.util.Calendar;

public class CalenderTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calendar cal = Calendar.getInstance();
		 
		 
		 System.out.println("지금은"+(cal.get(cal.MONTH)+1)+"월 입니다"); //월은 항상 1을 더해줘야한다. 달력은 우리나라에서 만든게 아니라 다름. 세계표준 따르느라 이렇게 1씩 더한다
		 System.out.println("지금은"+cal.get(cal.DAY_OF_MONTH)+"일 입니다");
		 System.out.println("시간은"+cal.get(cal.HOUR_OF_DAY)+"시"+cal.get(cal.MINUTE)+"분");
	}

}
