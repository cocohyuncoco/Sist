package day0207;


/*
 * <extends 와 implements 구분>
 * 클래스가 클래스를 extends
 * 클래스가 인터페이스를 implements (클래스에서만 인터페이스를 구현한다 하는구나)
 * 인터페이스가 인터페이스를 extends (같은 인터페이스면 상속한다 하는구나)
 */

//인터페이스를 구현하는 클래스를 정의 

class Fooda implements FoodShop_10{
		//구현한다. 완성한다 란 의미로 implements를 붙인다
		//완성해야 되니까 미구현된 메서드가 있을것이다. 이것도 오버라이딩 해야함
		
	
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
		//SHOPNAME="서울돈까스"; //인터페이스 안에 있는건 무조건 final이라 못고쳐서 오류남
		//인터페이스 안에 있는건 무조건 추상메서드
		
		System.out.println(SHOPNAME);
		System.out.println("음식을 주문합니다");
	}

	@Override
	public void beadal() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		System.out.println("음식을 배달합니다");
	}
	
}
////////////////////////////////

public class ImplFoodShop_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법#1
		Fooda fa = new Fooda();
		fa.order();
		fa.beadal();
		System.out.println("------------------------");
		
		//방법#2 다형성
		FoodShop_10 fs = new Fooda();
		fs.order();
		fs.beadal();
		System.out.println("------------------------");
	
		
	}

}
