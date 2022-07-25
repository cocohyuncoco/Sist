package day0203;

import java.util.Iterator;

class Jungbo{
	
	
	private String name;
	private String blood;
	private int age;

	
	//생성자
	public Jungbo(String name, String blood, int age) {
		this.name = name;
		this.blood = blood;
		this.age = age;
	}
	
	//제목
	public static void title() {
		System.out.println("이름\t혈액형\t나이");
		System.out.println("========================");
	}
	
	//출력
	public void mag() {
	
		System.out.println(this.name+"\t"+this.blood+"\t"+this.age+"세");
		
	}
}
/////////////////////////////
public class JungboEx_Quiz_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jungbo []ju = {
				 new Jungbo("김은비","O형",20),
				 new Jungbo("김주찬","A형",21),
				 new Jungbo("김종민","AB형",18)};
		
//		ju[0] = new Jungbo("김은비","O형",20);
//		ju[1] = new Jungbo("김주찬","A형",21);
//		ju[2] = new Jungbo("김종민","AB형",18);
		
		System.out.println("***총"+ju.length+"명 정보출력***");
		
		Jungbo.title();
		
		for (Jungbo s:ju) {
			s.mag();
		}
		
		
	}

}
