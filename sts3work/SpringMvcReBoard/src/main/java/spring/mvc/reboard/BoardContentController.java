package spring.mvc.reboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import answer.data.AnswerDaoInter;
import answer.data.AnswerDto;
import board.data.BoardDaoInter;
import board.data.BoardDto;

@Controller
public class BoardContentController {

	
	@Autowired
	BoardDaoInter dao;
	
	//얘를 받아야 댓글도 가져옴
	@Autowired
	AnswerDaoInter adao;
	
	
	@GetMapping("board/content")
	public ModelAndView content(
			@RequestParam int num,
			@RequestParam int currentPage)
	{
		ModelAndView model = new ModelAndView();
		
		//카운트증가
		dao.updateReadCount(num);
		
		//하나의 데이터
		BoardDto dto = dao.getData(num);
		
		model.addObject("dto", dto);
		model.addObject("currentPage", currentPage);
		
		//num에 해당하는 댓글을 db에서 가져와 보낸다
		List<AnswerDto> alist = adao.getAnswerList(num);
		
		//댓글이 있을때만 보내야함으로
		model.addObject("alist", alist); //댓글이 있으면 댓글리스트
		model.addObject("acount", alist.size()); //댓글갯수
		
		model.setViewName("board/content");
		
		return model;
	}
	
	

}
