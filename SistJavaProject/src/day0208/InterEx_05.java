package day0208;

//�������̽� ����
//�������̽��� ���߱����� �����ϴ�

interface interA{
	
	//������ �� �̿��� �޼��带 �������ְ�
	
	public void draw();
	public void write();
	
}
///////////////////////////
interface interB extends interA{
	public void play();
}
///////////////////////////
class InterImpl implements interA,interB{//���߱��� ���� (���߻���� �ȉ�)

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�౸�� �մϴ�");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�׸��� �׷���");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("����۾�����");
	}
	
}
///////////////////////////
public class InterEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterImpl in = new InterImpl();
		in.draw();
		in.play();
		in.write();
		
		System.out.println("**������ ���**");
		
		interA inA =new InterImpl();
		inA.draw();
		inA.write();
		
		interB inB =new InterImpl();
		inB.play();
		
	}

}
