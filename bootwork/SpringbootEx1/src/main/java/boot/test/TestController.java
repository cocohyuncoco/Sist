package boot.test;

import java.util.List;
import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/shop/list")
	public List<ShopDto> list(){
		List<ShopDto> list = new Vector<ShopDto>();
		
		ShopDto d1 = new ShopDto();		
		d1.setShop("사과");
		d1.setSu(10);
		d1.setDan(1000);
		list.add(d1);
		
		ShopDto d2 = new ShopDto();		
		d2.setShop("오렌지");
		d2.setSu(5);
		d2.setDan(2000);
		list.add(d2);
		
		return list;
	}
}
