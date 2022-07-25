package spring.mvc.read;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class PhotoUploadController {
	
	@GetMapping("/uploadform1")
	public String form1() {
		return "board/uploadform1";
	}
	

	@GetMapping("/uploadform2")
	public String form2() {
		return "board/uploadform2";
	}
	

	@PostMapping("/upload1")	
	public ModelAndView read1(
							@RequestParam String title, 
							@RequestParam MultipartFile photo,
							HttpServletRequest request)
	{	
		ModelAndView model = new ModelAndView();
		
		//업로드할 실제 경로 구하기
		String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image");
		String fileName = photo.getOriginalFilename(); //업로드한 파일명
		
		//fileName이 있으면
		if (!fileName.equals("")) {
			
			fileName="photo_"+fileName;
			
			//path에 업로드 하기
			//file은 익셉션 해줘야한다..지금 얘네가 멀티익셉션...
			
			//transferTo메서드 자체가 이렇게 간단하다.
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
			fileName="no"; //업로드 안했을경우
		}
		model.addObject("fileName", fileName);
		model.addObject("title", title);
		model.addObject("path", path);
		
		model.setViewName("board/uploadresult1");
		return model;
	}
	
	

	@PostMapping("/upload2")	
	public ModelAndView read2(
							@RequestParam String title, 
							@RequestParam ArrayList<MultipartFile> photo,
							HttpServletRequest request)
	{	
		ModelAndView model = new ModelAndView();
		
		//업로드할 실제 경로 구하기
		String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image");
		
		ArrayList<String> files = new ArrayList<String>();
		
		//파일명 담기_photo를 MultipartFile에 대입
		for (MultipartFile f:photo) {
			String fileName = "photo_"+f.getOriginalFilename();
			files.add(fileName);
			
			//업로드
			try {
				f.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.addObject("files", files);
		model.addObject("title", title);
		model.addObject("path", path);
		
		model.setViewName("board/uploadresult2");
		return model;
	}
	
	
	
	
	
}