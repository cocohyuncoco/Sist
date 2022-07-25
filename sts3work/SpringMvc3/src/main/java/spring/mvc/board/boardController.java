package spring.mvc.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class boardController {
	
	@GetMapping("/board/form1")
	public String form1() {

		return "board/writeform"; //폴더명/파일명
	}
	
	//form에서 값 받아서 출력보내기
	@PostMapping("/board/process")
	public ModelAndView prosecc1(
			@RequestParam String name,
			@RequestParam String date, 
			@RequestParam String gender, 
			/* required = true 가 기본값, 항목이 없어도 에러안나게 하려면 false, 또는 defaultValue */
			@RequestParam(required = false) String msg,
			@RequestParam(name = "pageNum", defaultValue = "1") int currentPage)
	{	
		ModelAndView model = new ModelAndView();
		
		model.addObject("name", name);
		model.addObject("date", date);
		model.addObject("gender", gender);
		model.addObject("msg", msg);
		model.addObject("currentPage", currentPage);
		
		model.setViewName("board/result1");
		return model;
	}
	
	@GetMapping("/board/result2")
	public String result2(Model model) {
		
		model.addAttribute("myimg1", "../image/f15.png");
		model.addAttribute("title", "내가 좋아하는 과일");
		
		return "board/result2";
	}
	
	@GetMapping("/shop/list")
	public String list() {
		return "shop/list";
	}
}
