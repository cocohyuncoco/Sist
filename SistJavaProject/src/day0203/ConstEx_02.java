package day0203;

//생성자_객체생성시 자동호출되는 메서드
//일반메서드와 차이점: 리턴형이 없다
//클래스명과 같다
//OverLoading이 가능
//생성자 끼리의 호출은 this()..this()는 반드시 첫줄;

class Apple{

	Apple(){
		System.out.println("디폴트 생성자 호출");
	}

}
////////////////////////////////////////
class Banana{

	public Banana(String str) { //str 이라는 값 전달 해줄수있는 생성자
		// TODO Auto-generated constructor stub
		System.out.println("생성자 호출:"+str);

	}
}
//////////////////////////////////////
class Orange{

	//생성자 오버로딩
	public Orange() {
		// TODO Auto-generated constructor stub
		System.out.println("오렌지 디폴트 생성자 호출");
	}
	public Orange(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("오렌지 두번째 생성자 호출:"+str);
	}
	public Orange(int n) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("오렌지 세번째 생성자 호출:"+n);
	}
}
/////////////////////////////////
public class ConstEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple ap = new Apple();
		//Banana ba = new Banana(); //<- 인자있는 생성자를 만들면 디폴트 생성자는 만들어지지 않음으로 에러
		Banana ba = new Banana("Happy");




	}

}

