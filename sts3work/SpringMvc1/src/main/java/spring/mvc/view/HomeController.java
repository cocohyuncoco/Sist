package spring.mvc.view;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//스프링에 컨트롤러엔 딱 3개밖에 안쓴다
	//ModelAndView -> 데이터 전달 저장, forward
	//Model -> 데이터 전달 저장
	//String -> forward
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		//request에 저장
		model.addAttribute("msg", "HomeController로 부터 포워드됨");
		model.addAttribute("today", new Date());
		
		//포워드
		return "home"; //web-INF/views/home.jsp
	}
	
	@RequestMapping("/apple/list") //이렇게쓰면 apple/list.do, apple/list.nhn도 찾는다
	//@RequestMapping("/apple/list.do") 이렇게 쓰면 apple/list.do 주소만 찾을수있다 
	public String hello(Model model) {
		model.addAttribute("name", "조정언");
		model.addAttribute("addr", "강남구 역삼동 쌍용");
		
		return "result1"; //web-INF/views/result1.jsp
	}
}
