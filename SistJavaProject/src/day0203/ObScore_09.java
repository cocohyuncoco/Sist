package day0203;


class score{

	private String name;
	private int java;
	private int spring;

	public static final String TITLE ="--�߰���� ������--";


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

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	//�߰��޼��� /�޼���� �����Ѱ� �� �������� ���ο��� �ּ������� ȣ���ϴ°� ���� �ڵ�
	public int getTot() {

		int s = this.java+this.spring;
		return s;

		//retrun java+string
	}

	public double getAvg() {
		return getTot()/2.0;
	}
}
////////////////////////////////////
public class ObScore_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		score s = new score();

		s.setName("������");
		s.setJava(90);
		s.setSpring(87);

		int tot = s.getTot(); //�̷��Ե� ���̾�
		double avg = s.getAvg();

		System.out.println("**scoreŬ����**");
		System.out.println(score.TITLE);  // Ÿ��Ʋ�� �ҷ��ö� ������ Ŭ����.����

		System.out.println("�̸�: "+s.getName());
		System.out.println("�ڹ�����: "+s.getJava());
		System.out.println("����������: "+s.getSpring());

		System.out.println("�հ�: "+tot);
		System.out.println("���: "+avg);

		//���� �ڵ�� ���־��� ������������ ����






	}

}

