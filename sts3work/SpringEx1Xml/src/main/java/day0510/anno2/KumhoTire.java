package day0510.anno2;

import org.springframework.stereotype.Component;

@Component("htire")
public class KumhoTire implements Tire {

	@Override
	public void writeTireName() {
		// TODO Auto-generated method stub
		System.out.println("��ȣŸ�̾�");
	}

}
