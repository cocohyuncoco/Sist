package day0204;

class MyCar{
	
	String carName;
	int carPrince;
	String carColor;
	
}

public class CallByEx_03 {

	
	public static void dataIn(MyCar car) {
		
		car.carName="ī�Ϲ�";
		car.carPrince=4500;
		car.carColor="���ֻ�";
	}
	
	public static void dataOut(MyCar car) {
		
		System.out.println("�ڵ�����: "+car.carName);
		System.out.println("����: "+car.carPrince);
		System.out.println("����: "+car.carColor);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar car = new MyCar();
		
		dataIn(car);
		dataOut(car);
		
	}

}
