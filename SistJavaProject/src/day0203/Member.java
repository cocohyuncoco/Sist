package day0203;

public class Member {
	
	private String name;
	private String gender;
	private String addr;

	static String ban;
	static int cnt = 0;

	//�����޼���(����3��¥��)
	public void setData(String name, String gender, String addr) {
		
		this.name = name;
		this.gender = gender;
		this.addr = addr;
	}

	//��� �޼���
	public void getData() {
		cnt++;
		System.out.println("[�л�"+cnt+"����]");
		System.out.println("�̸�: "+this.name);
		System.out.println("�Ҽ��б�: "+Member.ban);
		System.out.println("����: "+this.gender);
		System.out.println("�ּ�: "+this.addr);
		System.out.println("-------------------------");

	}
	

	
	

}

