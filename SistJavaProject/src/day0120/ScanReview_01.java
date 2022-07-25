package day0120;

import java.util.Scanner;

public class ScanReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 이름입력: 이효리
		 * 키 입력: 168.5
		 * 몸무게 입력: 55.9
		 * 
		 * [입력정보]
		 * 이름:이효리
		 * 키&몸무게: 168.5cm/55.9kg
		 * 표준몸무게: 61.65kg
		 */
		
		Scanner sc= new Scanner(System.in);
		
		String name;
		double height, weight, st_weight;
		
		//입력
		System.out.print("이름입력: ");
		name=sc.nextLine();
		System.out.print("키 입력: ");
		height=Double.parseDouble(sc.nextLine()); //string->Double
		System.out.print("몸무게 입력: ");
		weight=sc.nextDouble(); //string->Double
		
		//계산
		st_weight=(height-100)*0.9;
		
		//출력
		
		System.out.println("[입력정보];");
		System.out.println("이름:"+name);
		System.out.println("키:"+height);
		System.out.println("몸무게:"+weight+"cm");
		System.out.printf("표준몸무게:%.1fkg", st_weight);
		
		
		
		
		
		
		
		
		
		
		
	}

}
