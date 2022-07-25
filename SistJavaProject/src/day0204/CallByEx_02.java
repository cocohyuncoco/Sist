package day0204;


/*
 * 기본형 데이타 타입: int, long, char, double, float, 등 등 총8개 <- 값만 전달
 * 레퍼런스형: 클래스(앞글자가 대문자)형태, 배열형태(배열이 클래스 범주에 들어간다는게 레퍼런스형 이기 떄문) <-레퍼런스 전달
 *  
 *  call By Value: 값이 전달
 *  call By reference: 주소
 */

class Test1{

	String name ="임현정";
	String addr = "용인";
}

public class CallByEx_02 {

	public static void changInt(int n) {//n값을 전달해서 변경시키는 메서드
		
		//1. call By Value: 값만 전달받음, 메인의 a와 여기의 n은 주소가 틀려
		System.out.println("전달받은 정수값: "+n);
		n=20;
	}
	
		//2. call By reference: 배열은 객체로 인식된다.(그래서 클래스랑 같은 범주에 있다), 주소가 전달됨, 여기서 변경하면 호출된곳 변할까?
		public static void changeArray(int[] arr) {
			
			System.out.println("전달받은 배열 출력");
			
			for (int a:arr) {
				System.out.println(a);
				arr[2]=100;//2번지 값이 100으로 바뀜
			}
			
		}
	
		//3. Test1 변수의 주소를 전달
		public static void changeTest(Test1 t1) {
			
			
			System.out.println("전달받은 Test1객체 출력");
			System.out.println(t1.name+","+t1.addr);
				
			//값변경
			t1.name="이효리";
			t1.addr="제주시 애월읍";
			
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		int a = 50;
		changInt(a); //값만 전달
		System.out.println("a의 값은 바뀔까?"+a);
		
		
		//2. 
		int [] arr2 = {10,20,30};
		changeArray(arr2);
		System.out.println("메서드 호출 후 배열가빗 확인하기");
		
		for (int ar:arr2) {
			System.out.println(ar); //2번지 값이 100으로 바뀜
			
		}
		
		//3. 
		Test1 t1 = new Test1();
		changeTest(t1);
		
		System.out.println("변경후 출력");
		System.out.println(t1.name+","+t1.addr);
		
		
	}

}
