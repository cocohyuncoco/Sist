package spring.mvc.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.data.MemberDaoInter;
import member.data.MemberDto;

@Controller
public class MemberController {

	@Autowired
	private MemberDaoInter dao;
	
	@GetMapping("member/list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		int totalCount = dao.getToralCount();
		
		List<MemberDto> list = dao.getAllDatas();
		
		model.addObject("totalCount", totalCount);
		model.addObject("list", list);
		
		model.setViewName("member/list");
		
		return model;
	}
	
	@GetMapping("member/writeform")
	public String addform() {
		return "member/writeform";
	}
	
	@PostMapping("member/write")
	public String insert(@ModelAttribute MemberDto dto) { //dto를 통째로 넘기는 @ModelAttribute
		
		dao.insertBoard(dto);				
		
		//list컨트롤러로 이동. list맵핑 주소를 가진 컨트롤러로. list.jsp로 가는거아님
		return "redirect:list"; 
	}
	
	
	@GetMapping("member/content")
	public ModelAndView content(@RequestParam String num) {
		
		ModelAndView model = new ModelAndView();
		MemberDto dto = dao.getData(num);
		model.addObject("dto", dto);
		
		model.setViewName("member/content");		
		return model;
	}
	
	
	@GetMapping("member/updateform")
	public ModelAndView updateform(@RequestParam String num)
	{
		ModelAndView model = new ModelAndView();
		MemberDto dto = dao.getData(num);
		model.addObject("dto", dto);
		
		model.setViewName("member/updateform");		
		return model;
	}
	
	@PostMapping("member/update")
	public String update(@ModelAttribute MemberDto dto) {
		
		dao.updateBoard(dto);
		return "redirect:member/list";
	}
	
	@GetMapping("member/delete")
	public String delete(@ModelAttribute MemberDto dto) {
		dao.deleteBoard(dto);
		return "redirect:list";
	}
	
}
