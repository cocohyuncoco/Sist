package spring.mvc.info;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.mvc.dto.TestDto;

@Controller
public class InfoController {
	
	
	@GetMapping("myform")
	public String info() {
		return "info/myform";
	}
	
	
	@PostMapping("result")
	public String result(@ModelAttribute("dto") TestDto dto)
	{		
		return "info/infowrite";
	}
	
}
