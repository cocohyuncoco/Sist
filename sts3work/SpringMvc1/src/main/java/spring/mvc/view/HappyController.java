package spring.mvc.view;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HappyController {

	@GetMapping("/banana/insert")
	public ModelAndView one() {
		
		//ModelAndView를 가장 많이쓴다
		
		//ModelAndView는 request 저장하기위한 Model과 
		//포워드 하기위한 view를 합친 클래스 입니다
		ModelAndView mview = new ModelAndView();
		
		//request에 저장
		mview.addObject("Java", 88);
		mview.addObject("Spring", 100);
		
		//포워드할 jsp파일 지정
		mview.setViewName("result2");
		
		return mview;
	}
	
	@GetMapping("/orange/delete")
	public String two(Model model, HttpSession session) {
		
		//request에 저장
		model.addAttribute("name", "최준영");
		
		//session에 저장
		session.setAttribute("myid", "admin");
		
		return "result3";
	}
	
	@GetMapping("/shop/detail") //view/shop/detail
	public String three() {
		return "result4";
	}
	
	@GetMapping("board/add/data") //view/board/add/data
	public String fore() {
		return "result5";
	}
	
}
