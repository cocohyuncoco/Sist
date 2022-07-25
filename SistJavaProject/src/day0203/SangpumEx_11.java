package day0203;

import java.util.Iterator;

class Shop{
	
	
	private String sangpum;
	private int price;
	private String color;
	
	//명시적생성자 (인자3개)
	
	public Shop(String sangpum, int price, String color) 
	{
		this.sangpum = sangpum;
		this.price = price;
		this.color = color;
	}
	
	//제목메서드(showTitle)
	public static void showTitle() 
	{
		System.out.println("상품명\t단가\t색상");
		System.out.println("---------------------");
	}
	
	
	//출력 (showSangpum)
	public void showSangpum() 
	{
		System.out.println(this.sangpum+"\t"+this.price+"원\t"+ this.color);
	}
	
}
///////////////////////////////
public class SangpumEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5개를 생성할거라는 주소만 할당
		Shop [] sh = new Shop[5]; 
		
		//5개의 shop 배열에 생성자 통해서 생성
		// sh[0].showSangpum(); <- 아직 생성안했음으로 NullpointException 발생
		
		sh[0] = new Shop("아이폰13",950000,"화이트");
		sh[1] = new Shop("갤럭시폴드",1200000,"핑크");
		sh[2] = new Shop("아이폰11",750000,"블랙");
		sh[3] = new Shop("맥북",2100000,"메탈그레이");
		sh[4] = new Shop("아이폰13",2000000,"그레이");
		
		//출력
		Shop.showTitle();
		
		
//		for (Shop s:sh) {
//			s.showSangpum();
//			System.out.println("---------------------");
//		}
//		
		
		for (int i=0;i<sh.length;i++) {
			Shop s = sh[i];
			s.showSangpum();
			
		}
		
		
	}

}
