package day0203;

public class StudentInfo {

	private String stuName;
	private String hp;
	private int score;

	//����Ʈ ������
	public StudentInfo() {
		this("ȫ�浿","010-222-3333",99);//3��ȣ��
	}

	public StudentInfo(String name, String hp) {
		this(name,hp,99); //3��ȣ��
	}

	//����� ������#3
	public StudentInfo(String name, String hp, int score) {

		this.stuName = name;
		this.hp = hp;
		this.score = score;

	}

	//��ü��� �޼���

	public void whileData() {

		System.out.println("�̸�: "+stuName);
		System.out.println("�̸�: "+stuName);
		System.out.println("�̸�: "+stuName);

	}





}
