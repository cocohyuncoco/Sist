package spring.mvc.board;

import java.text.NumberFormat;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.app.dto.ShopDto;

@Controller
public class ShopController {

	@GetMapping("shop/form2")
	public String form2() {
		return "shop/shopform";
	}
	
	//DTO�б�
	@PostMapping("shop/process2")
	public String process2(@ModelAttribute ShopDto dto
					/*�𵨿� shopDto�� �����ϰڴ� ��..�̸� ���ָ� �ձ��� �ҹ��ڵ�..bean�� ������ shopDto�� ��
					 * ���ϴ� �̸��� ������ @ModelAttribute("dto") �־������ */)
	{	
		return "shop/shopresult";
	}
	
	@GetMapping("shop/form3")
	public String form3() {
		return "shop/mapform";
	}
	
	@PostMapping("shop/process3")
	public ModelAndView preocess3(@RequestParam Map<String, String> map) {
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("name", map.get("name"));
		model.addObject("java", map.get("java"));
		model.addObject("spring", map.get("spring"));
		model.addObject("jquery", map.get("jquery"));
		
		model.setViewName("shop/mapresult");
		
		return model;
	}
	
}
