package day0204;


class Mango{
	//��� Ŭ���������� ������ �̷��� �д�
	//��� Ŭ���������� ��������,����,����
	
	private String writer;
	private String subject;
	private static String mes="Happy Friday!!";
	
	//����, ����
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMes() {
		return mes;
	}
	public static void setMes(String mes) {
		Mango.mes = mes;
	}
	
	
	
}
//////////////////////////////
public class ObMethodReview_01 {

	// Mango Ŭ������ �������� ����ϱ� ���� �޼���
	
	public static void writMango(Mango m) { //m�̶�� ���������� ���ؼ� �ҷ�����
		
		System.out.println("**����Ŭ���� ���**");
		System.out.println("�ۼ���: "+m.getWriter()); // ���������� ���ؼ� �ҷ��� ���ۿ� ����.
		//System.out.println("�̸�: "+Mango.getMes()); // �̷����ϸ� mes�ۿ� �Ⱥҷ��´�.
		System.out.println("����: "+m.getSubject());
		
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����Ŭ���� mes ȣ��
		//static �޼��嵵 static ����ó�� Ŭ���������� ȣ���մϴ�
		
		System.out.println(Mango.getMes());
		
		Mango m1 = new Mango();
		m1.setWriter("������"); //set���� ����
		m1.setSubject("������ ��ſ� �ݿ���");
		
		Mango m2 = new Mango();
		m2.setWriter("������");
		m2.setSubject("�ȳ�~~");
		
		//���� Ŭ������ static �޼��� ȣ���� Ŭ������ ���� �����ϴ�.
		writMango(m1);
		writMango(m2);
		
		
	}

}
