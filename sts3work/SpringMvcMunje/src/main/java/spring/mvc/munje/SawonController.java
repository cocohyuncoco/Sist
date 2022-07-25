package spring.mvc.munje;

import java.text.NumberFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SawonController {

	//��Ʈ�� �� �ϳ���..���߿� ������Ʈ �Ҷ� ���� index.jsp ���Ѵ� index�� / �����൵��
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
		
		String data = "�����: "+name+"<br> �޿�: "+nf.format(pay)+"��<br> ����: "+age+"�� <br> �μ�:"+buseo;
		
		model.addObject("data", data);
		model.setViewName("sawoninfo");
		
		return model;
	}
	
}
