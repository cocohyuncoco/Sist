package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysStringSearchEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 이름을 입력해서 그 이릉이 몇번째 있는지
		 * 그 이름이 없다고 출력
		 * 끝이라고 입력 하면 검색을 종료합니다 라고 출력
		 * 
		 * 스캐너, 와일트루문, 블리언
		 */
		
		String[] data= {"최준영","조정언","임현정","장수빈","조아라","이용기","이경룡","유태호","원연욱"};
		String name;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("**이름을 입력하세요**");
			name = sc.nextLine();
		
			if (name.equals("끝")) { 				
				System.out.println("검색을 종료합니다");
				break;
			}
			flag = false;
			
			for (int i=0;i<data.length;i++) {
				if (name.equals(data[i])) {
					flag=true;
					System.out.println((i+1)+"번째에 있습니다");
					}
				}
			
			if (!flag) {
				System.out.println(name+"님은 데이터에 없습니다");}
				
		}
		
	
	}

}
