package day0125;

import java.util.Iterator;

	public class ForGuguEx_06 {
	
		public static void hight_gugu(){
			
			//세로로 보이는 구구단
			for (int dan=2;dan<=9;dan++) {
				System.out.println("["+dan+"단]");
				for (int i=1;i<=9;i++) {
					System.out.print(dan+"X"+i+"="+dan*i+" ");
				}
				System.out.println();
			}
			
		}
	//------------------------------------------------------------
	public static void width_gugu(){
			
			//2단부터 4단까지 가로로 출력하시오
			for (int dan=2;dan<=9;dan++) {
				System.out.print("["+dan+"단]\t");
			}
			System.out.println();
			
			
			for (int i=1;i<=9;i++) {
				//System.out.println("["+dan+"단]");
				
				for (int dan=2;dan<=9;dan++) {
					
					System.out.print(dan+"X"+i+"="+dan*i+"\t");
				}
				System.out.println();
			}
			
	}
	//------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hight_gugu();
		width_gugu();
		
		
	
	}

}
