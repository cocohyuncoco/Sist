package day0208;

class Work{
	
	public void process() {
		System.out.println("�˹� ���ϴ���..");
	}
}
//////////////////
class Clean extends Work{
	@Override
	public void process() {
		System.out.println("**û�� �˹����Դϴ�**");
	}
}

class Food extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**�丮 ����� �˹����Դϴ�**");
	}
}

class Beadal extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**��� �˹����Դϴ�**");
	}
}
/////////////////
public class Inherit_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ���
		//�θ�Ŭ������ ���� �� ���� �����Ǿ��Ŀ� ���� �ڽ�Ŭ������ �������̵� �޼��尡 ȣ��ȴ�
		//�ϳ��� ������ ȣ���޴µ� ���� �����޴��Ŀ� ���� ���(�޼���)�� �޶���
		//�װ� ������ �̶���Ѵ�
		
		Work w =null;
		
		w=new Clean();
		w.process();
		System.out.println("--------------");
		
		w=new Food();
		w.process();
		System.out.println("--------------");
		
		w=new Beadal();
		w.process();
		
		
		
		
		
		
		
	}

}
