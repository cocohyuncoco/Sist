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
		model.addAttribute("msg", "�̹��� ���");
		return "hello";
	}

	@GetMapping("nice/hi")
	public String nice(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("name", "���缮");
		model.addAttribute("addr", "����� ������ ���ϵ�");
		return "nice";
	}
	
	
}
