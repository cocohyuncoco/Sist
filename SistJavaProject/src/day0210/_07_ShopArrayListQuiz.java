package day0210;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class _07_ShopArrayListQuiz {

	//클래스로 지정을 했음으로 데이터를 꺼내고 받을때도 클래스
	List<Shop> list = new Vector<Shop>();
	
	//데이터입력
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		String sang;
		int su, dan;
		
		System.out.println("상품은?");
		sang = sc.nextLine();
		System.out.println("가격은?");
		dan = sc.nextInt();
		System.out.println("수량은?");
		su = sc.nextInt();
		
		
		Shop shop = new Shop();
		shop.setSang(sang);
		shop.setDan(dan);
		shop.setSu(su);
		
		list.add(shop);
		
		System.out.println("현재상품입고:"+list.size()+"개"); 
	}
	
	//데이터출력
	public void jego() {
		System.out.println("No.\t상품명\t가격\t수량\t총액");
		
		
		for (int i=0;i<list.size();i++) {
			Shop s = list.get(i); //리스트내 지정된 위치에있는 요소값 돌려줌
			System.out.println(i+1+"\t"+s.getSang()+"\t"+s.getDan()+"\t"+s.getSu()+"\t"+s.getTot());
			//System.out.println(i+1+s.getSang()+s.getDan()+s.getSu()+s.getTot());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_07_ShopArrayListQuiz sl = new _07_ShopArrayListQuiz();
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("-----------------------");	
		while (true) {
			System.out.println("1.상품입고 2.상품재고  9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==1) {
				sl.inputData();
			}else if (n==2) {
				sl.jego();
			}else {
				System.out.println("종료합니다");
				break;
			}
			
		}

		
		
	}

}
