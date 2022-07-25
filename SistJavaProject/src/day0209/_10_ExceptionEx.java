package day0209;

import java.util.Random;
import java.util.Scanner;

public class _10_ExceptionEx {

	public static void process() {
		Scanner sc = new Scanner(System.in);
		int su1,su2;
		
		System.out.println("두수를 입력하세요");
		su1=sc.nextInt();
		su2=sc.nextInt();
		System.out.println("su1/su2="+su1/su2);
		
	}
	
	
	public static void process2() {
		
		//난수발생 random(), random
		
		//방법1
		//int rnd=(int)(Math.random()*10)+1;
		//System.out.println("발생한 난수는 "+rnd+" 입니다");
		
		//방법2 Random클래스		
//		Random r = null;// 선언만 하고 생성안함 Random r=new Random();
//		int rnd2 = r.nextInt(10)+1; //0~9사이 난수발생 /+1하면 1~10사이 난수발생
//		System.out.println("Random클래스로 발생한 난수는 "+rnd2+" 입니다");
		
		Random r = new Random();// 선언만 하고 생성안함 Random r=new Random();
		int rnd2 = r.nextInt(10)+1; //0~9사이 난수발생 /+1하면 1~10사이 난수발생
		System.out.println("Random클래스로 발생한 난수는 "+rnd2+" 입니다");
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		System.out.println();
		
		try {
			process2();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("메인에서 예외처리함:"+e.getMessage());
		}
	
		System.out.println("정상종료");
	}
	
}
