package day0203;

public class Member_07 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();

		mem1.setData("이나영", "여자", "서울시 용산구");
		mem2.setData("원빈", "남자", "서울시 용산구");
		mem3.setData("정우성", "남자", "서울시 용산구");

		Member.ban ="JAVA반";

		mem1.getData();
		mem2.getData();
		mem3.getData();


	}


}