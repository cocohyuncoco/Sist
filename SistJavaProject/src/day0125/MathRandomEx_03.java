package day0125;

import java.util.Iterator;

public class MathRandomEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10���� �����߻�
		for (int i=1;i<=10;i++) {
			Double n=Math.random();
			System.out.println(n);
		}
			System.out.println("---------------------");
			System.out.println("0~9 ������ �����߻�");
			
			for (int i=1;i<=10;i++) {
				int n=(int)(Math.random()*10);
				System.out.println(n);
				}
			System.out.println("---------------------");
			System.out.println("0~99 ������ �����߻�");
			for (int i=1;i<=10;i++) {
				int n=(int)(Math.random()*100);
				System.out.println(n);}
			
			System.out.println("---------------------");
			System.out.println("1~10 ������ �����߻�");
			
			for (int i=1;i<=10;i++) {
				int n=(int)(Math.random()*10)+1;
				System.out.println(n);
			}
			System.out.println("---------------------");
			System.out.println("1~45 ������ �����߻�");
			
			for (int i=1;i<=10;i++) {
				int n=(int)(Math.random()*45)+1;
				System.out.println(n);
			}
			System.out.println("---------------------");
			System.out.println("65~90 ������ �����߻�");
			for (int i=1;i<=10;i++) {
				int n=(int)(Math.random()*26)+65;
				System.out.println(n);
			}
		}
	}


