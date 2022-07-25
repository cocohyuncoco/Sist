package answercontroller.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import board.data.BoardDaoInter;
import board.data.BoardDto;

@Controller
public class JsonTestController {

	@Autowired
	BoardDaoInter dao;
	
	
	//방법1. @ResponseBody를 쓰면 여태쓰던거에서 @ResponseBody만 추가하면댐
	//dto들이 json타입으로 반환된다
	@GetMapping("/sist/list")
	public @ResponseBody List<BoardDto> list(){
		
		return dao.getList(0, 5);		
	}; 
	
	
	@GetMapping("/sist/data")
	public @ResponseBody BoardDto readData(@RequestParam int num) {
	
		return dao.getData(num);
	}
	
	
}
