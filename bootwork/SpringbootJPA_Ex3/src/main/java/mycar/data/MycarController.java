package mycar.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MycarController {

	//전에 햇을땐 인터페이스에서 완성시켯어서 인터페이스 받으나 dao받으나 똑같지만
	//여기선 인터페이스에서 완성 안시켜주고 dao에서 자동주입 받아서 dao로 받기
	@Autowired
	MycarDao dao;
	
	@GetMapping("/carform")
	public String form() {		
		return "carform";
	}
	
	@PostMapping("/insert")
	public String add(@ModelAttribute MycarDto dto) {
		
		dao.insertCar(dto);
		return "redirect:list";
	}
	
	@GetMapping({"/","/list"})
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		List<MycarDto> list = dao.getAllDatas();		
		model.addObject("list", list);
		model.addObject("count", list.size());
		model.setViewName("carlist");
		return model;		
	}
	
	@GetMapping("/updateform")
	public ModelAndView updateform(Long num) {
		
		ModelAndView model = new ModelAndView();
		
		MycarDto dto = dao.getData(num);
		
		model.addObject("dto", dto);

		model.setViewName("carUpdateform");		
		return model;
	}
	
	@PostMapping("update")
	public String update(@ModelAttribute MycarDto dto) {
		
		dao.updateCar(dto);
		
		return "redirect:list";
	} 
	
	//삭제
	@GetMapping("delete")
	public String del(@ModelAttribute MycarDto dto) {
		dao.delete(dto);
		return "redirect:list";
	}
	
	
	//삭제2
	@GetMapping("delete2")
	public String del2(Long num) {
		dao.delete2(num);
		return "redirect:list";
	}
	
	
	
	
	
	
}
