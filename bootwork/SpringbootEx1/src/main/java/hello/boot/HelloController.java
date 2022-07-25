package hello.boot;


import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController는 일반 컨트롤러 못씀..대신 일일이@ResponseBody안붙임

@RestController
public class HelloController {
	
	
	@GetMapping("/sist/hello")
	public HashMap<String, String> hello(){
		
		HashMap<String, String> data = new HashMap<>();
		data.put("message", "Have a Nice Day!!");
		return data;
	}
	
}
