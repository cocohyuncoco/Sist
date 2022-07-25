package day0119;

public class CastArgsTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Q. 매개변수를 이용하시고 변수도 마음대로 정해주세요
		 * 상품명: 아이폰13mini
		 * 수량: 20개
		 * 단가: 950.000원
		 * 총금액: ******원
		 * /		
		 */
		String sang=args[0];
		int amount=Integer.parseInt(args[1]);
		int price=Integer.parseInt(args[2]);
		
		int total=amount*price;
		
		System.out.println("상품명:"+sang);
		System.out.println("수량:"+amount+"개");
		System.out.println("단가:"+price+"원");
		System.out.println("총금액:"+total+"원");
	
		
	}

}
