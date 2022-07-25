package board.data;

import java.util.List;

public interface BoardDaoInter {
	
	//데이터 총 갯수
	public int getToralCount();
	
	//num의 max값 구하기
	public int getMaxNum();
	
	//답글
	public void updateReStep(int regroup, int restep);
	
	//insert
	public void insertReBoard(BoardDto dto);
	
	//list 출력
	public List<BoardDto> getList(int start, int perpage);
	
	//조회수 올리는 메서드
	public void updateReadCount(int num);
	
	//데이터 하나 가져오는 메서드
	public BoardDto getData(int num);

	//수정, 삭제시 비밀번호 체크
	public int getCheckPass(String num, String pass);
	
	//게시물 수정
	public void updateBoard(BoardDto dto);
	
	//게시물 삭제
	public void deleteBoard(int num);
	
	public List<BoardDto> getAllDatas();
}
