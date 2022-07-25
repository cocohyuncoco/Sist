package day0207;
/*
 * 단가:1000원
	상품명:딸기
	수량:5개
	
	단가:1200원
	상품명:오렌지
	수량:4개

 */

class Shop{
	
	private String sangpum;
	private int su;
	
	//디폴트 생성자
	public Shop() {
		//sangpum="키워";
		//su=20;
		//방법1
		
		this("키위", 20); //방법2
	}
	
	//명시적 생성자
	public Shop(String sangpum, int su) {
		// TODO Auto-generated constructor stub
		this.sangpum=sangpum;
		this.su=su;
	}
	
	//출력메서드
	public void writeShop() {
		System.out.println("상품명: "+this.sangpum+"\n수량: "+this.su+" 개");
	}
	
}
//////////////
class My extends Shop{
	private int price;
	
	public My() {
		// TODO Auto-generated constructor stub
		//디폴트생성자는 super가 생략되있으니까 불러와진다
		price=2000;
		
	}
	
	//상속받은후 명시적 생성자 완성
	public My(String sangpum, int su, int price) {
		// TODO Auto-generated constructor stub
		super(sangpum, su);
		this.price=price;
	}
	
	
	//메서드 오버라이딩해서 완성
	@Override
	public void writeShop() {
		// TODO Auto-generated method stub
		System.out.println("단가: "+this.price+" 원");
		super.writeShop();
		
	}
	
}
///////////////
public class QuizInheri_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My my1 = new My("딸기", 5, 1000);
		my1.writeShop();
		System.out.println("---------------------");
		
		My my2 = new My("오렌지", 4, 1200);
		my2.writeShop();
		System.out.println("---------------------");
		
		My my3 = new My();
		my3.writeShop();
		System.out.println("---------------------");
			
	}

}
