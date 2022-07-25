package day0204;


import java.util.Scanner;

class Sist{
	
	static String school = "�ֿ����б�";
	private String name;
	private int java, oracle;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
	
	//����
	public int total() {
		return java+oracle;
	}
	
	//���
	public double average() {
		return total()/2.0;
	}
	
	//���л�����
	public String pung() {
		if (average()>=90) {
			return "���л�";
		}else if(average()>=80) {
			return "�հ�";
		}else {
			return "���հ�";
		}
	}
	
}

////////////////////////////////////////
public class QuizWeekStu {
	
	public static void write(Sist s) {
		System.out.println(s.getName()+"\t"+s.getJava()+"\t"+s.getOracle()+
				"\t"+s.total()+"\t"+s.average()+"\t"+s.pung());
	}
	
	
///////////////////MAIN/////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int inwon;
		Sist[] sist;
		String name;
		int java, oracle;
		
		//�ο��� �Է¹ޱ�
		System.out.println("�л��ο�");
		inwon = Integer.parseInt(sc.nextLine());
		
		//�ο��� �迭�� ����
		sist = new Sist[inwon];
		
		//�ο� ������ �Է�
		for (int i=0;i<inwon;i++) {
			//��ü����
			sist[i]=new Sist();
			//�Է¹ޱ�
			System.out.println(i+"�� �л��̸�");
			name = sc.nextLine();
			System.out.println("�ڹ����� �� ����Ŭ����");
			java = Integer.parseInt(sc.nextLine());
			oracle = Integer.parseInt(sc.nextLine());
			System.out.println();
			//�� ��ü�� ����
			sist[i].setName(name);
			sist[i].setJava(java);
			sist[i].setOracle(oracle);
			
		}
		
		System.out.println("**������**");
		System.out.println("�б���:"+Sist.school);
		System.out.println("�л���\tJAVA\tORACLE\t����\t���\t��");
		System.out.println("============================================");
		
		for (Sist s:sist) {
			write(s);
			
		}
			
	
	}

}
