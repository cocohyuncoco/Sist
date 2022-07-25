package member.data;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MemberDao extends SqlSessionDaoSupport implements MemberDaoInter {

	@Override
	public int getToralCount() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selectCountOfMember");
	}

	@Override
	public void insertBoard(MemberDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfMember", dto);
	}

	@Override
	public List<MemberDto> getAllDatas() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("selectAllOfMember");
	}

	@Override
	public MemberDto getData(String num) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selectOneOfMember", num);
	}

	@Override
	public void updateBoard(MemberDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().update("updateOfMember", dto);
	}

	@Override
	public void deleteBoard(MemberDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().delete("deleteOfMember", dto);
	}

}
