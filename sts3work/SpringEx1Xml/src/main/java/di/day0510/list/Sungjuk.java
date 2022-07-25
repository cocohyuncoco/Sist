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
	
	//출력
	public void writeSungjuk() {
		System.out.println("이름: "+stu.getName());
		System.out.println("나이: "+stu.getAge());
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("**나의 취미들**");
		
		for (String h:stu.getHobby()) {
			System.out.println("\t"+h);
		}
	}
}
