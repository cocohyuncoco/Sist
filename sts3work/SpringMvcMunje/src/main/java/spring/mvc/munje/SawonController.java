package spring.mvc.munje;

import java.text.NumberFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SawonController {

	//루트는 꼭 하나만..나중에 프로젝트 할땐 거의 index.jsp 로한다 index는 / 안해줘도됨
	@GetMapping("/")
	public String sawonform() {
		return "sawonform";
	}
	
	
	@PostMapping("/data")
	public ModelAndView read(@ModelAttribute SawonDto dto) {
	
		ModelAndView model = new ModelAndView();
		model.addObject("dto", dto);
		
		NumberFormat nf = NumberFormat.getInstance();
		
		String name = dto.getName();
		int pay = dto.getPay();
		int age = dto.getAge();
		String buseo = dto.getBuseo();
		
		String data = "사원명: "+name+"<br> 급여: "+nf.format(pay)+"원<br> 나이: "+age+"세 <br> 부서:"+buseo;
		
		model.addObject("data", data);
		model.setViewName("sawoninfo");
		
		return model;
	}
	
}
