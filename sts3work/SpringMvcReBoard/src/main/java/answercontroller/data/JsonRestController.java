package answercontroller.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import board.data.BoardDaoInter;
import board.data.BoardDto;


//방법2. @RestController를 쓰면 json전용 컨트롤러가된다. 상단에 이거 하나만 추가하면댐
//dto들이 json타입으로 반환된다
@RestController
public class JsonRestController {


	@Autowired
	BoardDaoInter dao;
	
	
	@GetMapping("/sist/list2")
	public List<BoardDto> list(){
		
		return dao.getList(0, 5);		
	}; 
	
	
	@GetMapping("/sist/data2")
	public BoardDto readData(@RequestParam int num) {
	
		return dao.getData(num);
	}
	
	
}
