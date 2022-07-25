package day0204;

class MyCar{
	
	String carName;
	int carPrince;
	String carColor;
	
}

public class CallByEx_03 {

	
	public static void dataIn(MyCar car) {
		
		car.carName="카니발";
		car.carPrince=4500;
		car.carColor="진주색";
	}
	
	public static void dataOut(MyCar car) {
		
		System.out.println("자동차명: "+car.carName);
		System.out.println("가격: "+car.carPrince);
		System.out.println("색상: "+car.carColor);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar car = new MyCar();
		
		dataIn(car);
		dataOut(car);
		
	}

}
