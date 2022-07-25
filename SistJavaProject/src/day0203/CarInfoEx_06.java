package day0203;


class Mycar{

	static String MEAGGE ="***나의 자동차 정보***";
	private String carName; //자동차명
	private int price; //자동차가격
	private String carColor; //자동차색상


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
		System.out.println("자동차명: "+this.carName+"\n차량가격 :"+this.price+"만원 \n차량색상: "+this.carColor);
	}
}

////////////////////////////////////////////
public class CarInfoEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mycar c1 = new Mycar();
		Mycar c2 = new Mycar();

		c1.setCarName("아반떼");
		c1.setPrice(2000);
		c1.setCarColor("화이트");

		c2.setCarName("미니쿠퍼");
		c2.setPrice(4000);
		c2.setCarColor("그린");

		System.out.println(Mycar.MEAGGE);
		c1.write();

		Mycar.MEAGGE ="***나의 새 자동차 정보***";
		System.out.println(Mycar.MEAGGE);
		c2.write();


	}

}
