package day0128;

class Sangpum{

	String sangpum; //��ǰ��
	static String SHOPNAME="�̸�Ʈ"; 
	int su;
	int dan;

	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
}
////////////////////////////////////////
public class ReviewOb_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sangpum sang1 = new Sangpum();
		sang1.setSangpum("�ڵ�ũ��");
		sang1.su=10;
		sang1.dan=2500;

		Sangpum sang2 = new Sangpum();
		sang2.setSangpum("���콺");
		sang2.su=20;
		sang2.dan=12000;

		System.out.println("������ :"+Sangpum.SHOPNAME);
		System.out.println("��ǰ��: "+sang1.getSangpum());
		System.out.println("����: "+sang1.su);
		System.out.println("�ܰ�: "+sang1.dan);
		System.out.println("-------------------------");
		System.out.println("��ǰ��: "+sang2.getSangpum());
		System.out.println("����: "+sang2.su);
		System.out.println("�ܰ�: "+sang2.dan);



	}

}
