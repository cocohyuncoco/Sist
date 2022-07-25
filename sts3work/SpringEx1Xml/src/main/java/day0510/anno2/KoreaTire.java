package day0510.anno2;

import org.springframework.stereotype.Component;

@Component("ktire") //xml id
public class KoreaTire implements Tire {

	@Override
	public void writeTireName() {
		// TODO Auto-generated method stub
		System.out.println("한국타이어");
	}

}
