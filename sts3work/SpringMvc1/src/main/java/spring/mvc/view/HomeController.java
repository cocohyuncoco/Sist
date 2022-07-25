package spring.mvc.view;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//�������� ��Ʈ�ѷ��� �� 3���ۿ� �Ⱦ���
	//ModelAndView -> ������ ���� ����, forward
	//Model -> ������ ���� ����
	//String -> forward
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		//request�� ����
		model.addAttribute("msg", "HomeController�� ���� �������");
		model.addAttribute("today", new Date());
		
		//������
		return "home"; //web-INF/views/home.jsp
	}
	
	@RequestMapping("/apple/list") //�̷��Ծ��� apple/list.do, apple/list.nhn�� ã�´�
	//@RequestMapping("/apple/list.do") �̷��� ���� apple/list.do �ּҸ� ã�����ִ� 
	public String hello(Model model) {
		model.addAttribute("name", "������");
		model.addAttribute("addr", "������ ���ﵿ �ֿ�");
		
		return "result1"; //web-INF/views/result1.jsp
	}
}
