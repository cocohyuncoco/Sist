package day0510.anno1;

import org.springframework.stereotype.Component;

@Component
//아이디 안해주면 자동으로 MyDao에서 앞글자만 소문자로 아이디로 함 -> myDao
//@Component("my") <- 아이디 내가 줄려면 이렇게

public class MyDao implements daoInter {

	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+" 데이터를 DB에 추가 성공");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println(num+" 에 해당하는 데이터 삭제 성공");
	}

}
