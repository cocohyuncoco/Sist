package day0203;

import java.util.Iterator;

class Jungbo{
	
	
	private String name;
	private String blood;
	private int age;

	
	//������
	public Jungbo(String name, String blood, int age) {
		this.name = name;
		this.blood = blood;
		this.age = age;
	}
	
	//����
	public static void title() {
		System.out.println("�̸�\t������\t����");
		System.out.println("========================");
	}
	
	//���
	public void mag() {
	
		System.out.println(this.name+"\t"+this.blood+"\t"+this.age+"��");
		
	}
}
/////////////////////////////
public class JungboEx_Quiz_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jungbo []ju = {
				 new Jungbo("������","O��",20),
				 new Jungbo("������","A��",21),
				 new Jungbo("������","AB��",18)};
		
//		ju[0] = new Jungbo("������","O��",20);
//		ju[1] = new Jungbo("������","A��",21);
//		ju[2] = new Jungbo("������","AB��",18);
		
		System.out.println("***��"+ju.length+"�� �������***");
		
		Jungbo.title();
		
		for (Jungbo s:ju) {
			s.mag();
		}
		
		
	}

}
