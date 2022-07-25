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
		//@RequestParam(required = true) ��� ������������ �⺻�� true null���϶� false�� �־���� ��
		
		ModelAndView model = new ModelAndView(); 
		int totalCount = dao.getToralCount(); //��ü����
		
		System.out.println(title+","+search);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("title", title);
		map.put("search", search);	
		
		List<HoewonDto> list = dao.getAllDatas(map);//��ü���
		
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
		//�������� ���ϸ� null..�������� ���� ����
		if (upload.getOriginalFilename().equals("")) { //�������� �����̸��� �������� 
			photo = "no";
		}else {
			String fName = upload.getOriginalFilename(); //�������� �����̸��� ���ؼ�
			photo = fName; //photo�� ���� �����ֱ�
			
			try {
				
				//���ε�...photo�� �ֳ� fName�̳� �Ȱ���
				upload.transferTo(new File(path+"\\"+photo));
				       
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//dto�� photo�� �־��ֱ� �ݵ��
		dto.setPhoto(photo);
		
		//insert...dto�� photo�� �־��ֱ� �����ؾ� photo���� ���õ� �ְ� �Ϻ��ϰ� ��
		dao.insertHoewon(dto);
		
		return "redirect:list";
	}
	
	
	
	
	
}
