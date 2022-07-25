package day0208;


class CarA{
	//프라이빗으로 선언한단건 기본적으로 캡슐화 이다
	//가지고 가고싶으면 메서드로 가져가 란뜻
	private String carName;
	private String carColor;
	
	public CarA() {
		// TODO Auto-generated constructor stub
		this("그랜져", "진주색");
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
		System.out.println("내차는 "+carName+"이고 "+carColor+" 입니다");
	}

}
////////////////////////////////////////
class MyCar extends CarA{
	private int carPrice;
	
	public MyCar() {
		this("그랜져", "진주색", 3500);
	}
	
	public MyCar(String carName, String carColor,int carPrice) {
		super(carName, carColor);
		this.carPrice=carPrice;
	}	
	//메서드 오버라이딩
	@Override
	public void writecar() {
		// TODO Auto-generated method stub
		super.writecar();
		System.out.println("내차 가격은 "+carPrice+" 만원 이에요");
		
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

		//디폴트 객체생성
		MyCar mc1 = new MyCar();
		mc1.writecar();
		
		System.out.println("----------------------");
		
		//명시적 객체생성
		MyCar mc2 = new MyCar("테슬라", "블루", 5500);
		mc2.writecar();
		System.out.println("----------------------");
		
		System.out.println("**1번째 Car값 수정해보기**");
		mc1.setCarName("테슬라");
		mc1.setCarColor("블루");
		mc1.setCarPrice(5000);
		mc1.writecar();
		System.out.println("----------------------");
		
		
		
		
	}

}
