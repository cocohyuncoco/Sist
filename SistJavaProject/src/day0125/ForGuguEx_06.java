package day0125;

import java.util.Iterator;

	public class ForGuguEx_06 {
	
		public static void hight_gugu(){
			
			//���η� ���̴� ������
			for (int dan=2;dan<=9;dan++) {
				System.out.println("["+dan+"��]");
				for (int i=1;i<=9;i++) {
					System.out.print(dan+"X"+i+"="+dan*i+" ");
				}
				System.out.println();
			}
			
		}
	//------------------------------------------------------------
	public static void width_gugu(){
			
			//2�ܺ��� 4�ܱ��� ���η� ����Ͻÿ�
			for (int dan=2;dan<=9;dan++) {
				System.out.print("["+dan+"��]\t");
			}
			System.out.println();
			
			
			for (int i=1;i<=9;i++) {
				//System.out.println("["+dan+"��]");
				
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
