package data.controlller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import data.dto.BookDto;
import data.mapper.BookMapperInter;

@Controller
public class BookController {

	@Autowired
	BookMapperInter mapper;
	
	@GetMapping({"/","list"})
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		//db로부터 총갯수얻기
		int totalCount = mapper.getTotalCount();
		model.addObject("totalCount", totalCount);
		
		//전체 리스트
		List<BookDto> list = mapper.getAllDatas();
		model.addObject("list", list);
		
		//포워드
		model.setViewName("booklist");
		return model;
	}
	
	//폼으로 이동
	@GetMapping("/form")
	public String form() {
		return "bookform";
	}
	
	//insert
	@PostMapping("/insert")
	public String insert(@ModelAttribute BookDto dto,
						@RequestParam MultipartFile upload,
						HttpSession session)
	{
		//이미지저장경로
		String path = session.getServletContext().getRealPath("/photo");
		
		
		if (upload.getOriginalFilename().equals("")) {
			dto.setBookphoto("null");
		}else {
			
			String fileName = upload.getOriginalFilename();			
			dto.setBookphoto(fileName); // DB에 저장될 파일명(실제 업로드된..)
			
			try {
				//★이게 제일중요 transferTo★
				upload.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
		//DB에 저장
		mapper.insertBook(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/content")
	public ModelAndView conlist(@RequestParam String num) {
	
		ModelAndView model = new ModelAndView();
				
		BookDto dto = mapper.getData(num);
		model.addObject("dto", dto);
		
		//포워드
		model.setViewName("bookcontent");
		return model;
	}
	
	
	//업데이트 폼
	@GetMapping("/updateform")
	public ModelAndView updateform(
			@RequestParam String num) {
		
		ModelAndView model = new ModelAndView();
		
		BookDto dto = mapper.getData(num);
		model.addObject("dto", dto);
		
		model.setViewName("updateform");
		return model;
	}
	
	//업데이트
	@PostMapping("/update")
	public String update(@ModelAttribute BookDto dto,
						@RequestParam MultipartFile photo,
						HttpSession session)
	{
		//이미지저장경로
		String path = session.getServletContext().getRealPath("/photo");
		System.out.println(path);
		
		if (photo.getOriginalFilename().equals("")) {
			dto.setBookphoto("null");
		}
		else {
			String fileName = photo.getOriginalFilename();
			
			try {
				//★이게 제일중요 transferTo★
				photo.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			dto.setBookphoto(fileName); // DB에 저장될 파일명(실제 업로드된..)
		}
		
		//DB에 수정
		mapper.updateBook(dto);
		
		return "redirect:list";
	}
	
	//삭제
	@GetMapping("/delete")
	public String delete(@RequestParam String num,
						HttpSession session) {
		
				
		
		String photo = mapper.getData(num).getBookphoto();
		
		if (!photo.equals("null")) {			
			//실제 업로드 경로
			String path = session.getServletContext().getRealPath("/photo");
			System.out.println(path); 
		
			File file = new File(path+"\\"+photo); 
			file.delete();
		
		}
		
		mapper.deleteBook(num);
		
		return "redirect:list";
	}
}
