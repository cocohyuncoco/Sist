package member.data;

import java.util.List;


public interface MemberDaoInter {
	//count메서드
	public int getToralCount();
	
	//insert
	public void insertBoard(MemberDto dto);
	
	//select
	public List<MemberDto> getAllDatas();

	//하나의 데이터
	public MemberDto getData(String num);

	//update
	public void updateBoard(MemberDto dto);
	
	//delete
	public void deleteBoard(MemberDto dto);
	
}
