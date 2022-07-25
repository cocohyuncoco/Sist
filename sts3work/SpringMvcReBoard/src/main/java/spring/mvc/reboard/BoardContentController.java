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
	
	//�긦 �޾ƾ� ��۵� ������
	@Autowired
	AnswerDaoInter adao;
	
	
	@GetMapping("board/content")
	public ModelAndView content(
			@RequestParam int num,
			@RequestParam int currentPage)
	{
		ModelAndView model = new ModelAndView();
		
		//ī��Ʈ����
		dao.updateReadCount(num);
		
		//�ϳ��� ������
		BoardDto dto = dao.getData(num);
		
		model.addObject("dto", dto);
		model.addObject("currentPage", currentPage);
		
		//num�� �ش��ϴ� ����� db���� ������ ������
		List<AnswerDto> alist = adao.getAnswerList(num);
		
		//����� �������� ������������
		model.addObject("alist", alist); //����� ������ ��۸���Ʈ
		model.addObject("acount", alist.size()); //��۰���
		
		model.setViewName("board/content");
		
		return model;
	}
	
	

}
