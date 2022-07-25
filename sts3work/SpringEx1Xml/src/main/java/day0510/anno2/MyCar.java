package day0510.anno2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar {
	
	//@Autowired //tire에 있는 모든 메서드 자동주입..매칭이 2개면 에러난다 
	
	//@Resource(name = "ktire")
	@Resource(name = "htire")
	Tire tire;
	
	public void WriteTire() {
		System.out.println("내 차의 타이어 브랜드는");
		tire.writeTireName();
	}
	
	
}
