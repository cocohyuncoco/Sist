package day0209;

import java.util.Scanner;

import day0209.PayOuter.InputInner;
import day0209.PayOuter.SudangInner;

class PayOuter{
	
	
	private String sawonName;
	private int gibonPay,timeSu,familSu;
	
	//내부클래스 객체선언 /이렇게 아웃클래스에 내부클래스 객체 선언해두면 메인메서드에서 부르는 방법이 달라진다
	InputInner input=new InputInner();
	SudangInner output = new SudangInner();
	
	//외부메서드_내부클래스 호출
	public void process() {
		//데이터입력
		input.inputData();
		
		//데이터출력
		output.writeData();
	}
	
	
	//입력에 관한 내부 클래스
	class InputInner{

		public void inputData() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("사원명 입력");
			sawonName = sc.nextLine();
			
			System.out.println("기본급 입력");
			gibonPay = sc.nextInt();
			
			System.out.println("초과시간 입력");
			timeSu = sc.nextInt();
			
			System.out.println("가족수 입력");
			familSu = sc.nextInt();
		}
	}
	//출력에 관한 메서드를 내부 클래스로
	class SudangInner{
		//시간외수당
		public int getTimeSudang() {
			return timeSu*10000;
		}
		
		//가족수당
		public int getFamilySudang() {
			if (familSu<=3) {
				return 200000;	
			}else {
				return 300000;
			}
		}
		//실수령액
		private int getNetpay() {
			return gibonPay+getFamilySudang()+getTimeSudang();
		}
		
		//출력메서드
		public void writeData() {
			System.out.println("사원명\t기본급\t초과시간수\t가족수\t시간수당\t가족수당\t실수령액");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+familSu+"\t"+
			getTimeSudang()+"\t"+getFamilySudang()+"\t"+getNetpay());
			
		}
		
	}
	
} 

public class _02_InnerReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법1 외부클래스에 내부클래스 객체선언 했을시 방법
		//PayOuter pay = new PayOuter();
		//pay.process();
		
		//방법2 외부클래스에 내부클래스 객체선언 안했을시 방법
		PayOuter pay = new PayOuter();
		PayOuter.InputInner input = pay.new InputInner();
		input.inputData(); //데이터입력
		
		PayOuter.SudangInner output = pay.new SudangInner();
		output.writeData(); //데이터입력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
