package Spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/login/form")
	public String login() {
		return "loginform";
	}
	
	@GetMapping("/login/read")
	public String process(Model model, @RequestParam(value = "myid") String id,
					@RequestParam(value = "mypass") String pass)
	{		
		model.addAttribute("id", id);
		
		String msg ="";
		
		if (pass.equals("1234"))
			msg="�α��� ����!";
		else 
			msg ="�α��� ����!";
		
		model.addAttribute("msg", msg);
		
		return "loginresult";
	}
	
}
