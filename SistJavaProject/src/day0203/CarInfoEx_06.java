package day0203;


class Mycar{

	static String MEAGGE ="***���� �ڵ��� ����***";
	private String carName; //�ڵ�����
	private int price; //�ڵ�������
	private String carColor; //�ڵ�������


	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public void write() {
		System.out.println("�ڵ�����: "+this.carName+"\n�������� :"+this.price+"���� \n��������: "+this.carColor);
	}
}

////////////////////////////////////////////
public class CarInfoEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycar c1 = new Mycar();
		Mycar c2 = new Mycar();

		c1.setCarName("�ƹݶ�");
		c1.setPrice(2000);
		c1.setCarColor("ȭ��Ʈ");

		c2.setCarName("�̴�����");
		c2.setPrice(4000);
		c2.setCarColor("�׸�");

		System.out.println(Mycar.MEAGGE);
		c1.write();

		Mycar.MEAGGE ="***���� �� �ڵ��� ����***";
		System.out.println(Mycar.MEAGGE);
		c2.write();


	}

}
