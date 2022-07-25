package day0510.anno1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic")
//아이디 직접 등록해준거, 아이디가 logic이 된다

public class LogicController {
	
	//인터페이스를 통해서 인클리먼트 한 경우는 주로 이렇게 인터페이스를 가지고온다
	//@Autowired //자동주입 
	@Resource(name = "")
	daoInter daointer;
	
	
	//daoInter와 MyDao는 같은애다
	
	public LogicController(MyDao dao) {
		// TODO Auto-generated constructor stub
		this.daointer=dao;
	}
	
	//insert
	public void insert(String str) {
		daointer.insertData(str);
	}

	//delete
	public void delete(String num) {
		daointer.deleteData(num);
	}
	
	
}

