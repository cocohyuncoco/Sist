package day0209;


import java.util.Scanner;

// 사용자정의 Exception

class UserException extends Exception{
	
	public UserException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
///////////////////////

public class _11_UserException {
	
	public static void process() throws UserException{
		
		Scanner sc = new Scanner(System.in);
		
		int age =0;
		//나이가 20~40세가 아니면 UserException 강제발생
		System.out.println("나이를 입력하세요");
		age=sc.nextInt();
		
		if (age<20 || age>40) {
			throw new UserException("멤버가 될수 없습니다");
		}else {
			System.out.println("당신은 "+age+"세 이므로 멤버로 등록됨");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			process();
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			e.getMessage();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("정상종료");
		
	}

}
