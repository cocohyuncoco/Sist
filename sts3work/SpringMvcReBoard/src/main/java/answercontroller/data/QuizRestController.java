package answercontroller.data;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import board.data.BoardDaoInter;
import board.data.BoardDto;

@RestController
public class QuizRestController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/rest/list1")
	public List<BoardDto> alllist(){
		
		List<BoardDto> list = dao.getAllDatas();
		
		for (BoardDto dto:list) {
			
			if (!dto.getPhoto().equals("no")) {//������ no�� �ƴϸ�
				
				String [] photos = dto.getPhoto().split(",");
				dto.setPhoto(photos[0]); //������ ù��°�ɷ� �ֱ�
			}
		}		
		return list;
	}
}

