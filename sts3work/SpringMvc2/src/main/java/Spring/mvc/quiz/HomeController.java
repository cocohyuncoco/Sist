package Spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
		
	@GetMapping("happy")
	public String happy() {
		// TODO Auto-generated method stub
		return "happy";
	}
	
	@GetMapping("hello")
	public String hello(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("msg", "이미지 출력");
		return "hello";
	}

	@GetMapping("nice/hi")
	public String nice(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("name", "유재석");
		model.addAttribute("addr", "서울시 강남구 역북동");
		return "nice";
	}
	
	
}
