package data.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import data.Dto.IpgoDto;
import data.mapper.IpgoMapperInter;

@Controller
public class IpgoController {

	@Autowired
	IpgoMapperInter mapper;
	
	
	
	@GetMapping("/ipgo/list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		int totalCount = mapper.getTotalCount();
		List<IpgoDto> list = mapper.getAllDatas();
		
		model.addObject("totalCount", totalCount);
		model.addObject("list", list);
				
		//model.setViewName("ipgolist"); //jsp 리졸버
		
		model.setViewName("/ipgo/ipgolist");
		
		
		return model;
	}
	
	@GetMapping("/ipgo/ipgoform")
	public String form() {
		return "/ipgo/ipgoform";
	}
	
	@PostMapping("/ipgo/insert")
	public String insert(@ModelAttribute IpgoDto dto,
						@RequestParam MultipartFile upload, //form에 있는 file 인풋의 name넣기
						HttpSession session) //리얼패스 찾으려면 쓰는...Http서블릿이나 Http세션..여기에 리얼패스가 있음)
	{
		
		//경로...webapp폴더 밑에 photo폴더 만들어야함
		String path = session.getServletContext().getRealPath("/photo");
		System.out.println(path);
		
		//사진명
		String photoname = "f_"+upload.getOriginalFilename();
		dto.setPhotoname(photoname);
		
		//실제업로드
		try {
			upload.transferTo(new File(path+"\\"+photoname));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//인서트
		mapper.insertIpgo(dto);
		
		//목록
		return "redirect:list";
	}
	
	
	
	
	
	
	
}
