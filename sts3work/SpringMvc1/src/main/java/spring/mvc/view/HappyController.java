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
		
		//ModelAndView�� ���� ���̾���
		
		//ModelAndView�� request �����ϱ����� Model�� 
		//������ �ϱ����� view�� ��ģ Ŭ���� �Դϴ�
		ModelAndView mview = new ModelAndView();
		
		//request�� ����
		mview.addObject("Java", 88);
		mview.addObject("Spring", 100);
		
		//�������� jsp���� ����
		mview.setViewName("result2");
		
		return mview;
	}
	
	@GetMapping("/orange/delete")
	public String two(Model model, HttpSession session) {
		
		//request�� ����
		model.addAttribute("name", "���ؿ�");
		
		//session�� ����
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
