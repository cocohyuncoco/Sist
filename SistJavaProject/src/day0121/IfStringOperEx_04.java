package day0121;

import java.util.Scanner;

public class IfStringOperEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڿ� �񱳴� ���迬���ڷ� �ϸ� �ȵǰ�
		// equlas��� �޼��带 ����ؼ� ���Ѵ�
		
		Scanner sc = new Scanner(System.in);
		
		String msg;
		System.out.println("����ܾ �Է��ϼ���");
		System.out.println("�Է´ܾ)happy,angel,rose,winter,summer");
		
		msg=sc.nextLine();
		System.out.println("�Է��� ���ڿ�: "+msg);
		
		//���ڿ� ������ڷ� ���Ϸ��� �ּ� �񱳸� ��..�� �� equlas �޼��� ���Ǥ�
		
		if(msg.equals("angel")) {
			System.out.println("***õ��***");}
		else if(msg.equalsIgnoreCase("HAPPY")) {
			System.out.println("***�ູ�ϴ�***");}
		else if(msg.equalsIgnoreCase("rose")) {
			System.out.println("***���***");}
		else if(msg.equalsIgnoreCase("winter")) {
			System.out.println("***�ܿ�***");}
		else if(msg.equalsIgnoreCase("suMMer")) {
			System.out.println("***����***");}
		else if(msg.equalsIgnoreCase("�赿��")) {
			System.out.println("***��������Դϴ�***");}
		else {
			System.out.println("***������ ���� ���ڿ� �Դϴ�***");}
		}
		
	}

