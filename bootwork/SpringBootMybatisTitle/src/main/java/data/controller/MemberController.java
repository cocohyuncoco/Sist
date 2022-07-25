package data.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import data.mapper.MemberMapperInter;

@Controller
public class MemberController {

	@Autowired
	MemberMapperInter mapper;
	
	@GetMapping("/member/form")
	public String form() {
		
		return "/member/memberinsert";
	}
	
	@GetMapping("/member/idcheck")
	@ResponseBody
	public Map<String, Integer> idcheck(@RequestParam String id) {
		
		Map<String, Integer> map = new HashMap<>();
		int n = mapper.getSerchId(id);
		
		map.put("count", n);		
		return map;
	}

	// 화면의 비동기 데이터 처리는 @ResponseBody로 한다.
	// @ResponseBody는 Json형태로 값을 가져오고
	// 비동기식 클라 - 서버 통신을 위해 Json으로 주고받는 것
	// json 형태 데이터는 키, 값 형태로 가져와야해서 Map사용
	// Map은 키, 값 으로 구성 
	
}
