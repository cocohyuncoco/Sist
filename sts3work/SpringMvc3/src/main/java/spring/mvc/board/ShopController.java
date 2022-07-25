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
	
	//DTO읽기
	@PostMapping("shop/process2")
	public String process2(@ModelAttribute ShopDto dto
					/*모델에 shopDto로 저장하겠단 뜻..이름 안주면 앞글자 소문자됨..bean에 저장이 shopDto로 됨
					 * 원하는 이름이 있으면 @ModelAttribute("dto") 넣어줘야함 */)
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
