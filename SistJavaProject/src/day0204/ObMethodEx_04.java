package day0204;
/*
 * 메서드 장점
 * 한면 만들어두면 재활용 가능 (코드 줄일수있다)
 * 
 * 작성요령 
 * 1. 접근제한자 public
 * 2. 지정예약어 static(쓸때도있고 안쓸때도있고)
 * 3. 리턴 값 retrue
 * 4. 리턴 값이 없다는 void
 * 5. 이름
 * 6. 메서드명(인자값1, 2, 3....)
 * 
 *  총
 *  public static 리턴형(void) 메서드명 (인자값1, 2, 3...)
 *  
 *  1. 반복적인 코드를 줄여 관리용으로 편리
 *  2. 하나의 메서드에는 하나의 기능만 수행하도록 작성
 * 
 */
public class ObMethodEx_04 {

	//boolean 형
	public static boolean aaa() {
		return false;
	}
	//int 형
	public static int bbb() {
		int a=45;
		return a;
	}
	//int 인자 2개
	public static int ccc(int x, int y) {
		int z=x+y;
		return z;
	}
///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = aaa();
		System.out.println("a="+a);
	
		int b = bbb();
		System.out.println("b="+b);
	
		int c = ccc(20,30);
		System.out.println("c="+c); 
	}

}
