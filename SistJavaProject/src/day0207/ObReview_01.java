package day0207;


/*
 * [메뉴1]
 * 메뉴명:피자
 * 가격:15000원
 * -------------------
 * [메뉴2]
 * 메뉴명:스파게티
 * 가격:12000원
 * -------------------
 * [메뉴3]
 * 메뉴명:햄버거
 * 가격:8000원
 * -------------------
 * 
 */

class food{
	
	private String menu;
	private int pay;
	static int num;
	
	public void setFood(String menu, int pay) {
		this.menu = menu;
		this.pay = pay;
	}
	
	public void getFood() {
		num++;
		System.out.println("[메뉴"+num+"]");
		System.out.println("메뉴명: "+menu);
		System.out.println("가격: "+pay+"원");
		System.out.println("----------------");
		
	}
	
}

public class ObReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		food fd1 = new food();
		fd1.setFood("피자", 15000);
		fd1.getFood();
		
		food fd2 = new food();
		fd2.setFood("스파게티", 12000);
		fd2.getFood();
		
		food fd3 = new food();
		fd3.setFood("햄버거", 8000);
		fd3.getFood();
		
		
		
		
		
		
	}

}
