package di.day0510.list;

import java.util.Iterator;

public class Sungjuk {
	
	student stu;
	
	int kor,eng;

	public void setStu(student stu) {
		this.stu = stu;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//���
	public void writeSungjuk() {
		System.out.println("�̸�: "+stu.getName());
		System.out.println("����: "+stu.getAge());
		System.out.println("��������: "+kor);
		System.out.println("��������: "+eng);
		System.out.println("**���� ��̵�**");
		
		for (String h:stu.getHobby()) {
			System.out.println("\t"+h);
		}
	}
}
