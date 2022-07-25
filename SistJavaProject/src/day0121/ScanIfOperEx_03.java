package day0121;

import java.util.Scanner;

public class ScanIfOperEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수량과 단가를 입력후 총 금액을 알아보자
		// 일정개수 이상을 구입하면 일정금액을 할인해 준다고 가정해보자
		
		Scanner sc = new Scanner(System.in);
		
		
		String sangpum;
		int su,dan,total;

		System.out.println("상품명 은?");
		sangpum = sc.nextLine();
		System.out.println("수량은?");
		su = sc.nextInt();
		System.out.println("가격은?");
		dan = sc.nextInt();
		
		total = su*dan;
		System.out.println(sangpum+" 총 금액= "+total+"원");
		System.out.println("5개 구입시 총금액의 10% DC 해드립니다");
		
		int dc;
		
		if(su>=5){
			dc=total*1/10;
			System.out.println("할인된 가격 = "+dc);
		}
			 
		
		
	}

}
