package spring.mvc.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.data.BoardDaoInter;
import board.data.BoardDto;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDaoInter dao;
	
	@GetMapping("/list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		int totalCount = dao.getToralCount();
		
		List<BoardDto> list = dao.getAllDatas();
		
		model.addObject("totalCount", totalCount);
		model.addObject("list", list);
		
		model.setViewName("board/list");
		
		return model;
	}
	
	@GetMapping("/writeform")
	public String addform() {
		return "board/writeform";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute BoardDto dto) { //dto를 통째로 넘기는 @ModelAttribute
		
		dao.insertBoard(dto);				
		
		//list컨트롤러로 이동. list맵핑 주소를 가진 컨트롤러로. list.jsp로 가는거아님
		return "redirect:list"; 
	}
	
	
	@GetMapping("/content")
	public ModelAndView content(@RequestParam String num) {
		
		ModelAndView model = new ModelAndView();
		BoardDto dto = dao.getData(num);
		model.addObject("dto", dto);
		
		model.setViewName("board/content");		
		return model;
	}
	
	
	@GetMapping("/updateform")
	public ModelAndView updateform(@RequestParam String num)
	{
		ModelAndView model = new ModelAndView();
		BoardDto dto = dao.getData(num);
		model.addObject("dto", dto);
		
		model.setViewName("board/updateform");		
		return model;
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		
		dao.updateBoard(dto);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@ModelAttribute BoardDto dto) {
		dao.deleteBoard(dto);
		return "redirect:list";
	}
	
}
