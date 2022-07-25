package spring.mvc.reboard;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import answer.data.AnswerDaoInter;
import board.data.BoardDaoInter;
import board.data.BoardDto;

@Controller
public class BoardListController {
	
	//dao 자동주입
	@Autowired
	BoardDaoInter dao;
	
	@Autowired
	AnswerDaoInter adao;
	
	@GetMapping("/")
	public String start() {
		return "redirect:board/list";
	}
	
	@GetMapping("/board/list")
	public ModelAndView list(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage)
	{		
		ModelAndView model = new ModelAndView();
		int totalCount = dao.getToralCount();
		
		//페이징 처리에 필요한 변수
		int totalPage;   //총 페이지 수
		int startPage;   //각 블럭의 시작페이지
		int endPage;   //각 블럭의 끝페이지
		int start;      //각 페이지의 시작번호
		int perPage=5;   //한페이지에 보여질 게시글 개수
		int perBlock=5;   //한 블럭당 보여지는 페이지 개수		
				
		//총 페이지 개수
		totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
		
		//각 블럭의 시작페이지
		startPage=(currentPage-1)/perBlock*perBlock+1;
		endPage=startPage+perBlock-1;
		
		//만약 총 페이지수가 8개인 경우 1~5 // 6~8 이므로 두번째 블럭은 endpage=8이 되어야함
		if(endPage>totalPage)
		   endPage=totalPage;
		
		//각페이지에서 불러올 시작번호
		start=(currentPage-1)*perPage;
		
		//각페이지에서 필요한 게시글 가져오기
		List<BoardDto> list=dao.getList(start, perPage);
		
		//list(목록)에 각 들에 대한 댓글갯수 추가하기
		for (BoardDto d:list) {
			d.setAcount(adao.getAnswerList(d.getNum()).size());
		}
		
		//각 글앞에 붙일 시작번호 구하기
		//총 글이 20개면? 1페이지 20 2페이지 15부터 출력해서 1씩 감소
		int no=totalCount-(currentPage-1)*perPage; 
		
		//출력에 필요한 변수들을 requset에 저장
		model.addObject("list", list); //댓글갯수 포함 후 전달
		model.addObject("startPage", startPage);
		model.addObject("endPage", endPage);
		model.addObject("totalPage", totalPage);
		model.addObject("no", no);
		model.addObject("currentPage", currentPage);
		model.addObject("totalCount", totalCount);
				
		model.setViewName("board/boardlist");		
		return model;
	}
	

	
	
}
