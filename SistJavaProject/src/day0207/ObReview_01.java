package day0207;


/*
 * [�޴�1]
 * �޴���:����
 * ����:15000��
 * -------------------
 * [�޴�2]
 * �޴���:���İ�Ƽ
 * ����:12000��
 * -------------------
 * [�޴�3]
 * �޴���:�ܹ���
 * ����:8000��
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
		System.out.println("[�޴�"+num+"]");
		System.out.println("�޴���: "+menu);
		System.out.println("����: "+pay+"��");
		System.out.println("----------------");
		
	}
	
}

public class ObReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		food fd1 = new food();
		fd1.setFood("����", 15000);
		fd1.getFood();
		
		food fd2 = new food();
		fd2.setFood("���İ�Ƽ", 12000);
		fd2.getFood();
		
		food fd3 = new food();
		fd3.setFood("�ܹ���", 8000);
		fd3.getFood();
		
		
		
		
		
		
	}

}
