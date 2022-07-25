package day0207;



class Menu{
	
	static int no;
	private String foodName;
	private int price;
	private String bigo;
	
	//명시적 생성자로 3개
	
	public Menu(String foodName, int price, String bigo) {
		this.foodName = foodName;
		this.price = price;
		this.bigo = bigo;
	}
	
	//레이블_showTitle
	public static void showTitle() {
		System.out.println("No.\t음식명\t가격\t비교");
		System.out.println("===============================");
		
	}
		
	//출력_showMenu
	public void showMenu() {
		no++;
		System.out.println(no+"\t"+this.foodName+"\t"+this.price+"\t"+this.bigo);
	}
	
}
///////////////////////////////
public class ArratObReview_02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열로생성.. 4개 초기값 주면서 생성
		Menu [] me = {
				new Menu("막국수",8500,"추천메뉴"),
				new Menu("감자전",7000,"인기메뉴"),
				new Menu("메밀전",9000,"1위메뉴"),
				new Menu("파전",15000,"수요미식회추천")
		};
		
		
		Menu.showTitle();
		
		for (Menu m:me){
			m.showMenu();			
		}
	 
		
		
	}

}
