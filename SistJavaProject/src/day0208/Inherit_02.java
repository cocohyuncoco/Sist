package day0208;

//������ �ȵǴ°��� ������ ����
class Color{
	public void hello() {
		// TODO Auto-generated constructor stub
		System.out.println("�ȳ�~~���� ����Ʈ ĥ �غ��ô�");
	}
}
//////////////////////////////////////
class Red extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("���� ��繮�� �������� ĥ�Ұ�");
	}
}
class Blue extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("���� ��纮�� �Ķ����� ĥ�Ұ�");
	}
}
class Green extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("���� ������ �ʷ����� ĥ�Ұ�");
	}
}
/////////////////////////////////
public class Inherit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**1. Red�� ���� Red�� ����**");
		Red r1 = new Red();
		r1.hello();
		r1.process();
		System.out.println("----------------------");
		
		System.out.println("**2. Blue�� ���� Blue�� ����**");
		Blue r2 = new Blue();
		r2.hello();
		r2.process();
		System.out.println("----------------------");
		
		System.out.println("**3. Green�� ���� Green�� ����**");
		Green r3 = new Green();
		r3.hello();
		r3.process();
		System.out.println("----------------------");
		
		
		//�������� ���� �ȵ��� �ϴ� �׽�Ʈ
		System.out.println("4. Color�� �����ϰ� Red�� ����");
	
		//�������̵� �ȹް� ����� ������ó�� �Ҷ�
		//�ڽ����׸� �ִ� �޼���� �������´�
		
		Color c1 = new Red(); //������ ���� / �θ�� ȣ���ϰ� �ڽ����� ����
		c1.hello();
		//c1.process();
		
		/*
		 * �θ�� �����ϰ� �ڽ����� �����ϴ°� -> ������
		 * -�θ� �������ִ� �޼ҵ� ȣ��OK
		 * -�޼��� �������̵� �� ��� ȣ��OK
		 * -�θ����� ���� �ڽĸ� �����ִ� �޼���� ȣ��NO (������ �ٷ� �� ���) 
		 */
		
		
		
	}

}
