package data.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.mapper.MemberMapperInter;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	MemberMapperInter mapper;
	//3번째 레이아웃에 로그인폼이 뜨시게....
	
	@GetMapping("/main") //로그인으로 갈지,아웃으로 갈지처리
	public String form(HttpSession session,Model model)
	{
		//폼의 아이디 얻어줌
		String myid=(String)session.getAttribute("myid");
		//로그인 상태인지 아닌지
		String loginok=(String)session.getAttribute("loginok");
		
		//한번도 실행안하면 null
		if(loginok==null) //로그아웃
			return "/login/loginform";
		else { //로그인
			String name=mapper.getName(myid);
			model.addAttribute("name", name);
			
			return "/login/logoutform";
		}
		
	}
	
	@PostMapping("/loginprocess")
	public String loginProc(@RequestParam(required = false) String cbsave,
			@RequestParam String id,
			@RequestParam String pass,
			HttpSession session)
	{
		
		HashMap<String, String> map=new HashMap<>();
		map.put("id", id);
		map.put("pass", pass);
		
		int check=mapper.login(map);
		if(check==1) {
			//session설정
			session.setAttribute("myid", id);
			session.setAttribute("loginok", "yes");
			session.setAttribute("saveok", cbsave); //체크안하면 null,체크하면 on
			
			return "redirect:main";
		}else {
			
			return "/login/passfail";
		}
	}
	
	
	//로그아웃
	@GetMapping("/logoutprocess")
	public String logout(HttpSession session)
	{
		session.removeAttribute("loginok");
		return "redirect:main";
	}
	
}