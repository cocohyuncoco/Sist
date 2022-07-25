package day0211;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _01_FomatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date(); //데이타 아님 데이트 
		System.out.println(date);
		
		//날짜, 시간을 원하는 양식으로 출력
		
		//웹에서도 다 이거씀. 날짜면 날짜 형식 다 넣을수잇는게.
		//HH:24시간 MM:월 mm:분
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd HH:mm");//날짜이게 가장 흔하게 쓰이는것들
		System.out.println(sdf1.format(date));

		
		//hh:12시간표시 a:오전/오후
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		
		//EEE:요일짧게 EEEE:요일길게
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");  
		System.out.println(sdf3.format(date));
		
		
		//NumberFormat
		int money = 674556;
		Double num = 51.5421;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US); //화폐단위와 컴마제공 / 미국
		//NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA); //중국
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance(); //컴마제공
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
		
	}

}
