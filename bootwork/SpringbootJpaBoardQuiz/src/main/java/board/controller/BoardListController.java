package board.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import board.data.BoardDao;
import board.data.BoardDto;

@Controller
public class BoardListController {

	@Autowired
	BoardDao dao;
	
	@GetMapping("/")
	public String home() {
		return "redirect:list";
	}
	
	//등록폼으로 이동
	@GetMapping("write")
	public String form() {		
		return "writeform";
	}	
	
	//등록
	@PostMapping("/insert")
	public String add(@ModelAttribute BoardDto dto,
						@RequestParam MultipartFile upload,
						HttpSession session)
	{
		String path = session.getServletContext().getRealPath("/save");
		String fileName = upload.getOriginalFilename();
		System.out.println(path);
		try {
			upload.transferTo(new File(path+"\\"+fileName));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dto.setPhoto(fileName);
		
		dao.insert(dto);
		return "redirect:list";
	} 
	
	//출력
	@GetMapping("list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		List<BoardDto> list = dao.getAllData();
		model.addObject("list", list);
		model.addObject("count", list.size());
		model.setViewName("list");
		return model;		
	}
	
	//내용보기
	@GetMapping("/detail")
	public ModelAndView detail(Long num) {
		
		ModelAndView model = new ModelAndView();
		
		BoardDto dto = dao.getData(num);
		
		model.addObject("dto", dto);

		model.setViewName("detail");	
		
		return model;
	}
	
	
	
}
