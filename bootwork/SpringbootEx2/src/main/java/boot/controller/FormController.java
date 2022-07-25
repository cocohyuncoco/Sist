package boot.controller;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import boot.data.InfoDto;

@Controller
public class FormController {

	//form으로 이동하는 컨트롤러
	//각각출력
	@GetMapping("/sist/form1")
	public String form1() {
		return "form/form1";
	}

	//DTO출력
	@GetMapping("/sist/form2")
	public String form2() {
		return "form/form2";
	}
	
	//MAP출력
	@GetMapping("/sist/form3")
	public String form3() {
		return "form/form3";
	}
	
	
	
	//폼을 처리해서 전송하는 컨트롤러	
	//각각출력
	@PostMapping("/sist/read1")
	public ModelAndView read1(
			@RequestParam String name,
			@RequestParam int java,
			@RequestParam int spring
			) {
		
		ModelAndView model = new ModelAndView();
		//request에 저장
		model.addObject("name", name);
		model.addObject("java", java);
		model.addObject("spring", spring);
		model.addObject("tot", java+spring);
		model.addObject("avg", (java+spring)/2.0);
		
		model.setViewName("result/result1");
		return model;
	}
	
	//DTO출력
	@PostMapping("/sist/read2")
	public String read2(@ModelAttribute InfoDto dto) {
		
		return "result/result2";
	}
	
	
	//MAP전송으로 출력
	@PostMapping("/sist/read3")
	public ModelAndView read3(@RequestParam Map<String, String> map) {
		
		ModelAndView model = new ModelAndView();
		model.addObject("name", map.get("name"));
		model.addObject("blood", map.get("blood"));
		model.addObject("hp", map.get("hp"));
		
		model.setViewName("result/result3");
		return model;
		
	}
	
	
}
