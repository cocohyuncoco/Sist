package day0208;


class CarA{
	//�����̺����� �����Ѵܰ� �⺻������ ĸ��ȭ �̴�
	//������ ��������� �޼���� ������ ����
	private String carName;
	private String carColor;
	
	public CarA() {
		// TODO Auto-generated constructor stub
		this("�׷���", "���ֻ�");
	}
	
	public CarA(String carName, String carColor) {
		// TODO Auto-generated constructor stub
		this.carName=carName;
		this.carColor=carColor;
	}

	//setter, getter
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public void writecar() {
		System.out.println("������ "+carName+"�̰� "+carColor+" �Դϴ�");
	}

}
////////////////////////////////////////
class MyCar extends CarA{
	private int carPrice;
	
	public MyCar() {
		this("�׷���", "���ֻ�", 3500);
	}
	
	public MyCar(String carName, String carColor,int carPrice) {
		super(carName, carColor);
		this.carPrice=carPrice;
	}	
	//�޼��� �������̵�
	@Override
	public void writecar() {
		// TODO Auto-generated method stub
		super.writecar();
		System.out.println("���� ������ "+carPrice+" ���� �̿���");
		
	}
	//setter, getter
	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	

	
	
}

public class Inherit_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����Ʈ ��ü����
		MyCar mc1 = new MyCar();
		mc1.writecar();
		
		System.out.println("----------------------");
		
		//����� ��ü����
		MyCar mc2 = new MyCar("�׽���", "���", 5500);
		mc2.writecar();
		System.out.println("----------------------");
		
		System.out.println("**1��° Car�� �����غ���**");
		mc1.setCarName("�׽���");
		mc1.setCarColor("���");
		mc1.setCarPrice(5000);
		mc1.writecar();
		System.out.println("----------------------");
		
		
		
		
	}

}
