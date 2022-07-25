package day0209;

/*
 * RunTimeException: 컴파일할때는 문제가 없지만 실행 시 문제발생
 * NullpointException: 생성하지않고 메서드 호출
 * Numberformat: 입력데이터 형식오류
 * ArryaIndexOutOfBounce: 문자열의 인덱스오류..범위를 초과했을때
 * 
 * 
 */
public class _03_ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		try {
			int num = 3/0; //예외가 발생할수 있는 코드
		}catch (ArithmeticException e) {//해결해줄수있는 
			// TODO: handle exception
			//e.printStackTrace(); //자세한 예외정보 출력
			System.out.println(e.getMessage()); //예외처리 코드, 메세지
		}
		
		System.out.println("종료");
	}

}
