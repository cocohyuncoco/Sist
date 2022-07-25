package hi.boot;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {


	@GetMapping("/sist/hi")
	public @ResponseBody HashMap<String, String> hello(){
		
		HashMap<String, String> data = new HashMap<>();
		data.put("hi", "welcome~~");
		return data;
	}
}
