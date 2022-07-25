package spring.mvc.read;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudyController {

	
	@GetMapping("study/form1")
	public String form1() {
		return "day0512/memberform";
	}
	
	@PostMapping("study/upload3")
	public ModelAndView upload3(
					@RequestParam String name,
					@RequestParam MultipartFile photo,
					@RequestParam String hp,
					@RequestParam String addr,
					HttpServletRequest request)
	{		
		ModelAndView model = new ModelAndView();
		
		//업로드할 실제경로 구하고
		String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image");
		String fileName = photo.getOriginalFilename(); //업로드한 파일명 볼수있음
		
		if (!fileName.equals("")) {
			fileName="photo_"+fileName;
			try {
				photo.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			fileName="no"; //업로드 안했을경우 if문 만들때쓰자
		}
		
		model.addObject("fileName", fileName);
		model.addObject("path", path);
		model.addObject("name", name);
		model.addObject("hp", hp);
		model.addObject("addr", addr);
		
		model.setViewName("day0512/memberresult");
		
		return model;
	}
	
}
