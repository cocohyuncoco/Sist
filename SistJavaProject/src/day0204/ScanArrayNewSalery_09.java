package day0204;


import java.util.Scanner;


class Emp{
	
	private String name; //������
	private int pay; //�޿�
	private int famsu; //������
	private int timesu; //�ʰ��ð�
	
	
	//private�� �⺻������ ĸ��ȭ
	//������ setter, getter
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
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	
	//�ʰ��ð����� ���� �޼���
	
	public int getTimeSudang() {
		
		int n=0;
		
		if (timesu>=5) {
			n=150000;
		}else {
			n=timesu*30000;
		}
		return n;
	}
	
	//�������� ���� �޼���
	public int getFamilySudang() {
		
		int s=0;
		
		if (famsu>=4) {
			s=200000;
		}else {
			s = famsu*5; 
		}
		return s;		
	}
	
	//�ѱ޿� ���� �޼���
	public int getTotalPay() {

		int tp =pay+getFamilySudang()+getTimeSudang();
		return tp;		
	}
	
	//����
	public static void showTitle() {
		
		System.out.println("[�ֿ����� ���� �޿���Ȳ]");
		System.out.println();
		System.out.println("�����\t�޿�\t������\t�ʰ��ð�\t��������\t�ð�����\t�ѱ޿�");
		System.out.println("--------------------------------------------");
	}

}

////////////////////////////////////
public class ScanArrayNewSalery_09 {

	
	//���
	public static void writeEmp(Emp[] emp) {
		//������� ���
		Emp.showTitle();
		
		for (Emp e:emp) {//����ġ ��
			System.out.println(e.getName()+"\t"+e.getPay()+"\t"+e.getFamsu()+
					"\t"+e.getTimesu()+"\t"+e.getFamilySudang()+"\t"+e.getTimeSudang()
					+"\t"+e.getTotalPay());
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inwon; //�ο���
		
		Emp[] emp; //�������ֱ� ���� Ŭ����
		
		System.out.println("�Է��� ��������?");
		inwon = Integer.parseInt(sc.nextLine());
		
		//�迭�Ҵ�
		emp=new Emp[inwon];
		
		//�ο�����ŭ ����Ÿ �Է�
		for (int i=0;i<inwon;i++) {
			//emp����
			emp[i]=new Emp();
			
			System.out.println("�̸���?");
			String name=sc.nextLine();
			
			System.out.println("�޿���?");
			int pay = Integer.parseInt(sc.nextLine());
			
			System.out.println("��������?");
			int fs = Integer.parseInt(sc.nextLine());
			
			System.out.println("�ʰ��ٹ� �ð���?");
			int ts = Integer.parseInt(sc.nextLine());
			
			//setter�� empŬ������ ������ �ֱ�. ������ null��
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamsu(fs);
			emp[i].setTimesu(ts);
			
		}
		
		//��� 
		writeEmp(emp);
		
		
		
	}

}
