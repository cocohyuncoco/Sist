package board.data;

import java.util.List;

public interface BoardDaoInter {

	//count�޼���
	public int getToralCount();
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//select
	public List<BoardDto> getAllDatas();

	//�ϳ��� ������
	public BoardDto getData(String num);

	//update
	public void updateBoard(BoardDto dto);
	
	//delete
	public void deleteBoard(BoardDto dto);
	
}

