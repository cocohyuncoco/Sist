package mycar.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//빈에 등록
@Repository
public class MycarDao {
	
	@Autowired
	MycarInter carInter;
	
	//insert
	public void insertCar(MycarDto dto) {
		
		//id타입 유무에 따라 자동으로 insert, update
		//jpa에서 insert, update 메서드가 save
		carInter.save(dto);
	}
	
	//전체출력
	public List<MycarDto> getAllDatas(){
		
		return carInter.findAll();
	}
	
	//하나의 데이터 가져오기_num에 대한 반환값
	public MycarDto getData(Long num) {
		return carInter.getById(num);		
	}
	
	//수정
	public void updateCar(MycarDto dto) {
		
		//num이 포함되어 있음으로 수정댐
		carInter.save(dto);		
		
	}
	
	//삭제
	public void delete(MycarDto dto) {
		carInter.delete(dto);
	}
	
	
	//삭제2
	public void delete2(Long num) {
		carInter.deleteById(num);
	}
	
	
	
	
	
	
	
	
}
