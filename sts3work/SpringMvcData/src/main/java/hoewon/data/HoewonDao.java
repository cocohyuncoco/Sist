package hoewon.data;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class HoewonDao extends SqlSessionDaoSupport implements HoewonDaoInter {

	@Override
	public int getToralCount() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selectCountOfHoewon");
	}

	@Override
	public void insertHoewon(HoewonDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfHoewon", dto);
	}

	//��ü��¿� ���ı�ɱ��� �߰��� �޼���
	@Override
	public List<HoewonDto> getAllDatas(Map<String, String> map) {
		// TODO Auto-generated method stub		
		List<HoewonDto> list = getSqlSession().selectList("selectAllOfHoewon", map);
		return list;
	}



}
