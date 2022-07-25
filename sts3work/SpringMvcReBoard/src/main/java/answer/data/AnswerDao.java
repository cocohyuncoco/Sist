package answer.data;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class AnswerDao extends SqlSessionDaoSupport implements AnswerDaoInter {

	@Override
	public void insertAnswer(AnswerDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfReAnswer", dto);
	}

	@Override
	public List<AnswerDto> getAnswerList(int num) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("selectOfReAnswer", num);
	}

	@Override
	public int getCheckPass(int idx, String pass) {
		// TODO Auto-generated method stub
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("idx", idx);
		map.put("pass", pass);
		
		return getSqlSession().selectOne("PassCheckOfReAnswer", map);
	}

	@Override
	public void deleteAnswer(int idx) {
		// TODO Auto-generated method stub
		getSqlSession().delete("DeleteOfReAnswer", idx);
		
	}

	

	

}
