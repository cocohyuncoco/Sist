package day0510.anno1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic")
//���̵� ���� ������ذ�, ���̵� logic�� �ȴ�

public class LogicController {
	
	//�������̽��� ���ؼ� ��Ŭ����Ʈ �� ���� �ַ� �̷��� �������̽��� ������´�
	//@Autowired //�ڵ����� 
	@Resource(name = "")
	daoInter daointer;
	
	
	//daoInter�� MyDao�� �����ִ�
	
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

