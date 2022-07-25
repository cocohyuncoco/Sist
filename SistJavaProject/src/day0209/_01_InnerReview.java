package day0209;
//어제 진도 복습
interface Sawon{ 
	//인터페이스와 abstract의 차이는 인터페이스 에는 abstract밖에 못들어온다 그래서 생략가능
	public void addSawon();
	public void deletSawon();
	public void listSawon();
}
///////////////////////////

public class _01_InnerReview {

	//sawon 인터페이스를 익명내부클래스 형식으로 선언 후 메인에서 각 메서드 호출
	Sawon sa = new Sawon() {
		
		@Override
		public void listSawon() {
			// TODO Auto-generated method stub
			System.out.println("사원명단 출력");
		}
		
		@Override
		public void deletSawon() {
			// TODO Auto-generated method stub
			System.out.println("사원 퇴사");
		}
		
		@Override
		public void addSawon() {
			// TODO Auto-generated method stub
			System.out.println("사원 입사");
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_01_InnerReview ir = new _01_InnerReview();
		ir.sa.listSawon();
		ir.sa.addSawon();
		ir.sa.deletSawon();
		
	}

}
