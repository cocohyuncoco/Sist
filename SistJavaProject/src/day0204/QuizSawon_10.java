package day0204;

import java.util.Scanner;

class Sawon{
	
	private static String empName; //ȸ���
	private String name; //�����
	private int pay; //�޿�
	private int sudang; //����
	
	public static String getEmpName() {
		return empName;
	}
	public static void setEmpName(String empName) {
		Sawon.empName = empName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
		
	//�Ѽ��ɾ�

		public int getNetPay() {
			int m=pay+sudang;
			return m;
		}
}
//////////////////////////////////
	public class QuizSawon_10 {

	public static void writeSawon(Sawon s) {
		
		System.out.println(s.getName()+"\t"+s.getPay()+"\t"+s.getSudang()+
				"\t"+s.getNetPay());
	}
	
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inwon;
		String empName;
		Sawon[]sawon;
		String name;
		int pay,sudang;
		
		
		System.out.println("ȸ���̸��Է�");
		empName=sc.nextLine();
		
		//ȸ���̸� static��� ������ ����
		Sawon.setEmpName(empName);
		
		//�ѻ����
		System.out.println("�� ����� �Է�");
		inwon = Integer.parseInt(sc.nextLine());
		
		//inwon�� ��ŭ SaWon�迭 �Ҵ�
		sawon = new Sawon[inwon];
		
		//�Է�
		for (int i=0;i<inwon;i++) {
			sawon[i]=new Sawon(); //��ü����
			System.out.println("������Է�");
			name=sc.nextLine();
			
			System.out.println("���޿��Է�");
			pay = Integer.parseInt(sc.nextLine());
			
			System.out.println("�����Է�");
			sudang = Integer.parseInt(sc.nextLine());
			
			//�����ü�� �� �����ϱ�
			sawon[i].setName(name);
			sawon[i].setPay(pay);
			sawon[i].setSudang(sudang);
		}
		
		//���
		System.out.println("ȸ���: "+Sawon.getEmpName());
		System.out.println("�����\t�⺻��\t����\t�Ǽ���");
		
		for (Sawon s:sawon) {
			writeSawon(s);
			
		}
		
		
		
	}

}
