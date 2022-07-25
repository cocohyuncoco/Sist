package spring.mvc.data;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import hoewon.data.HoewonDaoInter;
import hoewon.data.HoewonDto;

@Controller
public class HoewonController {

	@Autowired
	private HoewonDaoInter dao;
	
	@GetMapping("/hoewon/list")
	public ModelAndView hlist(
			@RequestParam(defaultValue = "name") String title,
			@RequestParam(required = false) String search) {
		//@RequestParam(required = true) 얘는 생략되있지만 기본이 true null값일땐 false를 넣어줘야 댐
		
		ModelAndView model = new ModelAndView(); 
		int totalCount = dao.getToralCount(); //전체갯수
		
		System.out.println(title+","+search);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("title", title);
		map.put("search", search);	
		
		List<HoewonDto> list = dao.getAllDatas(map);//전체멤버
		
		model.addObject("totalCount", totalCount);
		model.addObject("list", list);		
		model.setViewName("hoewon/hlist");
		
		return model;
	}
	
	@GetMapping("/hoewon/form")
	public String form() {
		return "hoewon/hform";
	}
	
	@PostMapping("/hoewon/insert")
	public String insert(
			@ModelAttribute HoewonDto dto,
			@RequestParam MultipartFile upload,
			HttpSession session)
	{	
		String path = session.getServletContext().getRealPath("/WEB-INF/image");
		System.out.println(path);
		
		String photo = "";		
		//사진선택 안하면 null..했을경우는 사진 들어가고
		if (upload.getOriginalFilename().equals("")) { //오리지널 파일이름이 없을경우는 
			photo = "no";
		}else {
			String fName = upload.getOriginalFilename(); //오리지널 파일이름을 구해서
			photo = fName; //photo에 대입 시켜주기
			
			try {
				
				//업로드...photo로 주나 fName이나 똑같다
				upload.transferTo(new File(path+"\\"+photo));
				       
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//dto의 photo에 넣어주기 반드시
		dto.setPhoto(photo);
		
		//insert...dto의 photo에 넣어주기 먼저해야 photo까지 셋팅된 애가 완벽하게 들어감
		dao.insertHoewon(dto);
		
		return "redirect:list";
	}
	
	
	
	
	
}
