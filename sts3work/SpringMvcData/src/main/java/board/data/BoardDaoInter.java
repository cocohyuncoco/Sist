package board.data;

import java.util.List;

public interface BoardDaoInter {

	//count메서드
	public int getToralCount();
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//select
	public List<BoardDto> getAllDatas();

	//하나의 데이터
	public BoardDto getData(String num);

	//update
	public void updateBoard(BoardDto dto);
	
	//delete
	public void deleteBoard(BoardDto dto);
	
}

