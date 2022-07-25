package member.data;

import java.util.List;


public interface MemberDaoInter {
	//count�޼���
	public int getToralCount();
	
	//insert
	public void insertBoard(MemberDto dto);
	
	//select
	public List<MemberDto> getAllDatas();

	//�ϳ��� ������
	public MemberDto getData(String num);

	//update
	public void updateBoard(MemberDto dto);
	
	//delete
	public void deleteBoard(MemberDto dto);
	
}
