package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		mview.addObject("name", "임현정");
		mview.addObject("addr", "쌍용교육센터");
		mview.addObject("hp", "010-1111-2222");
		
		mview.setViewName("list");		
		return mview;
	}
	
}
