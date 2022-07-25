package day0209;

import java.util.Scanner;

/*
 * throws: 호출한 영역으로 예외처리 를 던짐
 * throw: 강제로 예외를 발생시킬때
 */
public class _08_ThrowsExcepEx {

	public static void scoreInput() throws Exception{
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int score=0;
		System.out.println("점수를 입력하세요");
		//0~100을 입력하지 않을시 익셉션 강제발생 시킬 예정
		
		score=sc.nextInt();
		
		if (score<0 || score>100) {
			throw new Exception("점수가 잘못 입력되었어요");
		}else {
			System.out.println("나의 점수는"+score+"입니다");
		}
			
		
	}
	
	public static void main(String[] args) {
		
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("오류메세지:"+e.getMessage());
		}
		System.out.println("정상종료");
	}
		
	

}
