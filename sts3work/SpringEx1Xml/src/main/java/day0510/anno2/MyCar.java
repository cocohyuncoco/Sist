package day0510.anno2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar {
	
	//@Autowired //tire�� �ִ� ��� �޼��� �ڵ�����..��Ī�� 2���� �������� 
	
	//@Resource(name = "ktire")
	@Resource(name = "htire")
	Tire tire;
	
	public void WriteTire() {
		System.out.println("�� ���� Ÿ�̾� �귣���");
		tire.writeTireName();
	}
	
	
}
