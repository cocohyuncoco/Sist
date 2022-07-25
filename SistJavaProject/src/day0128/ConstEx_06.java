package day0128;


class NumbConst{

	int num;

	//인자없는 생성자
	public NumbConst() { //나중에 사용할건지
		//num=10;
		System.out.println("생성자호출");
	}

	//인자있는 생성자
	public NumbConst(int num) { //지금 인자를넣어 사용할건지
		this.num=num; //래퍼런스 변수 this를 붙이는게 좋다. 변수 이름이 같을땐 무조건 붙여야하고
		System.out.println(num+"값을 인자로 가지고있는 생성자호출");
	}
	//클래스는 생성자 명과 동일하다. 메서드는 다르다.

	//메서드
	public int getNumber() {
		num=50;
		return num; //리턴(반환)값이 없으면 무조건 오류
	}


}
public class ConstEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//디폴트생성자 생성(객체생성)
		NumbConst num1 = new NumbConst(); //디폴트 생성자
		System.out.println(num1.num);

		//인자 num을 가진 객체 생성. 값을 보냄과 동시에 생성
		NumbConst num2= new NumbConst(30);
		System.out.println(num2.num);

		//메서드 호출 
		NumbConst num3= new NumbConst();
		System.out.println(num3.getNumber());



	}

}