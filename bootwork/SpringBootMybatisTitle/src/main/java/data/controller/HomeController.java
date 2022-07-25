package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/") //메인 홈페이지 경로
	public String home() {		
		return "/layout/main"; // 1/2 이게 슬래시 1번 슬래시 2번 ..1번은 폴더명 2번은 파일명
	}
	
	//오시는길을 누르면 레이아웃2가 배경으로오게
	@GetMapping("/load/map") 
	public String map() {		
		return "/sub/layout/map";
	}
	
	
	
}
