package spring.mvc.reboard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import board.data.BoardDaoInter;
import board.data.BoardDto;

@Controller
public class BoardUpdateController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/updatepassform")
	public ModelAndView update(
			@RequestParam String num,
			@RequestParam String currentPage)
	{
		
		ModelAndView model = new ModelAndView();
		model.addObject("num", num);
		model.addObject("currentPage", currentPage);
		
		//맵핑주소랑 jsp주소 똑같이해서 똑같으거임
		model.setViewName("board/updatepassform");
		return model;
		
	}

	
	@PostMapping("/board/updatepass")
	public ModelAndView updatepass(
			@RequestParam String num,
			@RequestParam String pass,
			@RequestParam String currentPage)
	{
		
		ModelAndView model = new ModelAndView();
		
		//비번이 맞으면 수정폼뜸, 틀리면 passfail
		int check=dao.getCheckPass(num, pass);

		if (check==1) {
			//비번이 맞으면 dto를 얻는다
			BoardDto dto = dao.getData(Integer.parseInt(num));
			
			model.addObject("dto", dto);
			model.addObject("currentPage", currentPage);
			
			model.setViewName("board/updateform");
		}else {
			
			model.setViewName("board/passfail");
		}
		
		return model;
	}
	
	@PostMapping("board/update")
	public String up(
			@ModelAttribute BoardDto dto,
			@RequestParam String currentPage,
			@RequestParam ArrayList<MultipartFile> upload,
			HttpSession session)
	{
		//업로드할 실제경로
		String path = session.getServletContext().getRealPath("/WEB-INF/photo");
		System.out.println(path);
		
		String photo = "";
		
		//사진선택 안했을경우 no, 했을경우 , 로 나열
		if (upload.get(0).getOriginalFilename().equals("")) 
			//첫번째 사진이 빈 문자열이면 photo는 no라고 하겠다.
			photo = "no";
		else {
			for (MultipartFile f:upload) {
				String fName = f.getOriginalFilename();
				photo += fName+",";
				
				//실제 업로드
				try {
					f.transferTo(new File(path+"\\"+fName));
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//photo에서 마지막 , 제거..최종적으로 넣어줄 photo
			photo = photo.substring(0, photo.length()-1);
		}
		
		//dto의 photo에 넣어주기
		dto.setPhoto(photo);		
		
		//dao에서 update호출 (다 넣은다음 호출)
		dao.updateBoard(dto);
		
		//content로 이동
		return "redirect:content?num="+dto.getNum()+"&currentPage="+currentPage; 
	}
}

