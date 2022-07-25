package Spring.mvc.quiz;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import quiz.data.TestDto;

@Controller
public class FormController {
	
	@GetMapping("/data/myform")
	public String form() {
		return "inputform";
	}
	
	//@RequestMapping(value = "read1",method = RequestMethod.GET)
	@GetMapping("/data/read1")
	public ModelAndView read1(@RequestParam String name,
			@RequestParam int age)
	{
		ModelAndView model = new ModelAndView();
		
		//request�� ����
		model.addObject("name", name);
		model.addObject("age", age);
		
		//������
		model.setViewName("process1");
		return model;
	}
	
	
	//dto �б�
	@PostMapping("/data/read2")
	public ModelAndView read2(@ModelAttribute TestDto dto) {
		//�̰� dto �� �о���°�
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("dto", dto);
		
		//������
		model.setViewName("process2");
		
		return model;
		
	}

	//Map���� �������� �б�
	//@RequestMapping(value = "/data/read3", method = RequestMethod.POST)
	@PostMapping("/data/read3")
	public ModelAndView read3(@RequestParam Map<String, String> map) {
		
		ModelAndView model = new ModelAndView();
		
		String sang = map.get("sang");
		String price = map.get("price");
		
		String data = sang+"�� ������ "+price+" �Դϴ�";
		
		model.addObject("data", data);
		
		//������
		model.setViewName("process3");
		
		return model;
	}
	
	
	
	
	
}
