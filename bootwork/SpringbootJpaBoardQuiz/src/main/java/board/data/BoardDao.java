package board.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDao {

	@Autowired
	BoardDaoInter inter;
	
	//insert
	public void insert(BoardDto dto) {
		inter.save(dto);
	}
	
	//출력
	public List<BoardDto> getAllData(){
		return inter.findAll();
	}
		
	//select	
	
	//getData(num반환)
	public BoardDto getData(Long num) {
		return inter.getById(num);		
	}
	
	
	
}
