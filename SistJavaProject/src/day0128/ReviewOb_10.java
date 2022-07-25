package day0128;

class Sangpum{

	String sangpum; //상품명
	static String SHOPNAME="이마트"; 
	int su;
	int dan;

	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
}
////////////////////////////////////////
public class ReviewOb_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sangpum sang1 = new Sangpum();
		sang1.setSangpum("핸드크림");
		sang1.su=10;
		sang1.dan=2500;

		Sangpum sang2 = new Sangpum();
		sang2.setSangpum("마우스");
		sang2.su=20;
		sang2.dan=12000;

		System.out.println("상점명 :"+Sangpum.SHOPNAME);
		System.out.println("상품명: "+sang1.getSangpum());
		System.out.println("수량: "+sang1.su);
		System.out.println("단가: "+sang1.dan);
		System.out.println("-------------------------");
		System.out.println("상품명: "+sang2.getSangpum());
		System.out.println("수량: "+sang2.su);
		System.out.println("단가: "+sang2.dan);



	}

}
